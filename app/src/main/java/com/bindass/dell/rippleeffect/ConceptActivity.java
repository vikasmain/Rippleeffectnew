package com.bindass.dell.rippleeffect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.bindass.dell.rippleeffect.db.DBAdapter;
import com.bindass.dell.rippleeffect.model.Question;

import java.util.ArrayList;
import java.util.List;

public class ConceptActivity extends AppCompatActivity {

   private List<Question> questionsList;
   private Question currentQuestion;

    private TextView txtQuestion,tvNoOfQs;
    private RadioButton rbtnA, rbtnB, rbtnC,rbtnD;
    private Button btnNext;
    private Button btnNext21;
    private int obtainedScore=0;
    private int questionId=0;

    private int answeredQsNo=0;

    ArrayList<String> myAnsList;

private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concept);
        MobileAds.initialize(this, "ca-app-pub-3571509120003278~1334979946");

        // Gets the ad view defined in layout/ad_fragment.xml with ad unit ID set in
        // values/strings.xml.
        mAdView = (AdView) findViewById(R.id.ad_view);

        // Create an ad request. Check your logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .build();

        // Start loading the ad in the background.
        mAdView.loadAd(adRequest);


        //Initialize the view
        init();

        //Initialize the database
        final DBAdapter dbAdapter=new DBAdapter(this);
        questionsList= dbAdapter.getAllQuestions();
        currentQuestion=questionsList.get(questionId);

        //Set question
        setQuestionsView();
btnNext21=(Button)findViewById(R.id.btnNext2);
        btnNext21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //Check and Next
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup grp=(RadioGroup)findViewById(R.id.radioGroup1);
                RadioButton answer=(RadioButton)findViewById(grp.getCheckedRadioButtonId());

                Log.e("Answer ID", "Selected Positioned  value - "+grp.getCheckedRadioButtonId());

                if(answer!=null){
                    Log.e("Answer", currentQuestion.getANSWER() + " -- " + answer.getText());
                    //Add answer to the list
                    myAnsList.add(""+answer.getText());

                    if(currentQuestion.getANSWER().equals(answer.getText())){
                        obtainedScore++;
                        Log.e("comments", "Correct Answer");
                        Log.d("score", "Obtained score " + obtainedScore);
                    }else{
                        Log.e("comments", "Wrong Answer");
                    }
                    if(questionId<dbAdapter.rowCount()){
                        currentQuestion=questionsList.get(questionId);
                        setQuestionsView();
                    }else{
                        Intent intent = new Intent(ConceptActivity.this, ResultActivity.class);

                        Bundle b = new Bundle();
                        b.putInt("score", obtainedScore);
                        b.putInt("totalQs", questionsList.size());
                        b.putStringArrayList("myAnsList", myAnsList);
                        intent.putExtras(b);
                        startActivity(intent);
                        finish();

                    }

                }else{
                    Log.e("comments", "No Answer");
                }

                //Need to clear the checked item id
                grp.clearCheck();


            }//end onClick Method
        });


    }

    public void init(){
        tvNoOfQs=(TextView)findViewById(R.id.tvNumberOfQuestions);
        txtQuestion=(TextView)findViewById(R.id.tvQuestion);
        rbtnA=(RadioButton)findViewById(R.id.radio0);
        rbtnB=(RadioButton)findViewById(R.id.radio1);
        rbtnC=(RadioButton)findViewById(R.id.radio2);
        rbtnD=(RadioButton)findViewById(R.id.radio3);

        btnNext=(Button)findViewById(R.id.btnNext);

        myAnsList = new ArrayList<String>();
    }


    private void setQuestionsView()
    {
        rbtnA.setChecked(false);
        rbtnB.setChecked(false);
        rbtnC.setChecked(false);
        rbtnD.setChecked(false);

        answeredQsNo=questionId+1;
        tvNoOfQs.setText("Questions "+answeredQsNo+" of "+questionsList.size());

        txtQuestion.setText(currentQuestion.getQUESTION());
        rbtnA.setText(currentQuestion.getOptionA());
        rbtnB.setText(currentQuestion.getOptionB());
        rbtnC.setText(currentQuestion.getOptionC());
        rbtnD.setText(currentQuestion.getOptionD());

        questionId++;
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
    }