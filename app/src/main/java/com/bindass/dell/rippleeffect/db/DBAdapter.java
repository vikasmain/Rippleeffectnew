package com.bindass.dell.rippleeffect.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bindass.dell.rippleeffect.model.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alfiroj on 5/13/16.
 */
public class DBAdapter extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "onlineicttutorQuiz";

    // Table name
    private static final String TABLE_QUESTION = "question";

    // Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_QUESION = "question";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA= "opta"; //option a
    private static final String KEY_OPTB= "optb"; //option b
    private static final String KEY_OPTC= "optc"; //option c
    private static final String KEY_OPTD= "optd"; //option d

    private SQLiteDatabase myDatabase;

    public DBAdapter(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        myDatabase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUESTION + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUESION
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC +" TEXT, "+KEY_OPTD+" TEXT)";

        db.execSQL(sql);

        addQuestions();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUESTION);

        // Create tables again
        onCreate(db);
    }

    public int rowCount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUESTION;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }

    public List<Question> getAllQuestions() {

        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUESTION;
        myDatabase=this.getReadableDatabase();

        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setId(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOptionA(cursor.getString(3));
                quest.setOptionB(cursor.getString(4));
                quest.setOptionC(cursor.getString(5));
                quest.setOptionD(cursor.getString(6));

                quesList.add(quest);

            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }

    private void addQuestions()
    {
        //format is question-option1-option2-option3-option4-answer

        Question q1=new Question("Is it possible to have an activity without UI to perform action/actions?","Not Posiible", "Wrong Question", "Yes it is possible", "None of the Above","Yes it is possible");
        this.addQuestion(q1);

        Question q2=new Question("IP is","Internet Program ", "Internet Protocol", "Intranet Protocol", "Internet Policy ","Internet Protocol");
        this.addQuestion(q2);

        Question q3=new Question("TCP is ","Technology Control Policy", "Transmission Control Protocol", "Transfer Currency Identity Policy ", "Term of Internet Protocol","Transmission Control Protocol");
        this.addQuestion(q3);

        Question q4=new Question("VOIP is ","Voice Over Internet Protocol", "Voice of Internet Program", "Voice Over Intranet Protocol", "Voice on Internet Protocol","Voice Over Internet Protocol");
        this.addQuestion(q4);

        Question q5=new Question("What is the difference between margin and padding in android layout?","Margin is specifying the extra space left on all four sides in layout", " Padding is used to offset the content of a view by specific px or dp", "Both A and B are correct", "None of the Above","Both A and B are correct");
        this.addQuestion(q5);
        Question q6=new Question("How many threads are there in asyncTask in android?","Only One", "Two", "AsyncTask doesn't have thread", "None of the above","Only One");
        this.addQuestion(q6);
        Question q7=new Question("What is sleep mode in android?","Only Radio interface layer and alarm are in active mode", "Switched off", "Air plane mode", "None of the above","Only Radio interface layer and alarm are in active mode");
        this.addQuestion(q7);
        Question q8=new Question("Persist data can be stored in Android through","Shared preferences", "Internal/external Storage", "Sqlite database", "All the above","All the above");
        this.addQuestion(q8);
        Question q9=new Question("What is a thread in android?","Async task", "Same as Services", "Broadcast Receivers", "Independent dis-patchable unit is called a thread","Independent dis-patchable unit is called a thread");
        this.addQuestion(q9);
        Question q10=new Question("What does httpclient.execute() returns in android?","Http client", "http response", "http result", "None of the above","http response");
        this.addQuestion(q10);
        Question q11=new Question("How many orientations does android support?","4", "1", "2", "3","4");
        this.addQuestion(q11);
        Question q12=new Question("How to make services to foreground in android?","services always works in foreground only", "no wecan't do this with query", "using startService", "startForeground(int id,Notification notification)","startForeground(int id,Notification notification)");
        this.addQuestion(q12);
        Question q13=new Question("How to access the context in content provider?","using getContext() in onCreate() method", "using getApplicationContext() anywhere in the application", "Both a and b", "None of the above","Both a and b");
        this.addQuestion(q13);
        Question q14=new Question("How to pass the data from Activity to services in android?","we can store the data in common database", "using putExtra() method int intent,we can send the data.while using it we need to call setResult() mehtod in services", "Both a and b", "None of the above","Both a and b");
        this.addQuestion(q14);
        Question q15=new Question("what is JSON in android?","Java script object notation", "A java language type", "Java support Objects Notations", "Don't exist in android","Java script object notation");
        this.addQuestion(q15);
        Question q16=new Question("What is pending Intent in android?","It is used for outside the applications", "it will fired at a future point of time", "type of explicit Intent", "type of Implicit Intent","it will fired at a future point of time");
        this.addQuestion(q16);
        Question q17=new Question("What is JNI in android?","Java Native Interface", "they are used to all native/cross applications", "Both a and b", "Only a","Both a and b");
        this.addQuestion(q17);
        Question q18=new Question("In which Technology we can refresh the dynamic content in android?","Java", "Ajax", "Android", "JNI","Ajax");
        this.addQuestion(q18);
        Question q19=new Question("What is time limit for BroadcastReceiver in android?","5sec", "10sec", "2sec", "20sec","10sec");
        this.addQuestion(q19);
        Question q20=new Question("What is package name of Http client in android?","org.apache.http.form", "org.apache.http.client", "org.apache.http.server", "None of the above","org.apache.http.client");
        this.addQuestion(q20);
        Question q21=new Question("What is application class in android?","A class that can create only one object", "Anonymous class", "Java class", "Base class for all classes","A class that can create only one object");
        this.addQuestion(q21);
        Question q22=new Question("What is GCM in android?","Google Client messaging", "Google cloud messaging", "Both a and b", "None of the above","Google cloud messaging");
        this.addQuestion(q22);
        Question q23=new Question("FCM in android?","Firebase Cloud messaging", "First-come messaging", "Firebase client messaging", "first-in-first-come messaging","Firebase Cloud messaging");
        this.addQuestion(q23);
        Question q24=new Question("What is Apk in android?","Android packaging kit", "Zip/pack folder", "org.json apk", "None of the above","Android packaging kit");
        this.addQuestion(q24);
        Question q25=new Question("What is Fragment in android?","It is a piece of activity", "we want to move our application 360", "Both a and b", "None of the above","Both a and b");
        this.addQuestion(q25);
        Question q26=new Question("What is LastKnownLocation in android?","to find the last location of a phone", "to find known location of a phone", "to find the last known location of a phone(stored at google)", "None of the above","to find the last known location of a phone(stored at google)");
        this.addQuestion(q26);
        Question q27=new Question("What language does android support?","Java", "C/C++", "Both a and b", "javascript","Both a and b");
        this.addQuestion(q27);
        Question q28=new Question("ANR is ....?","Application is not responding", "Android can't read", "Android not reachable", "None of the above","Application is not responding");
        this.addQuestion(q28);
        Question q29=new Question("Adapter in Android is.....?","it is used to create child views to represents the parent views items", "it is used to create parent views to represents the child views items", "used to store information", "None of the above","it is used to create child views to represents the parent views items");
        this.addQuestion(q29);
        Question q30=new Question("What is container in android?","it holds objects,widgets only", "it holds objects,widgets,labels,fields,icons,buttons etc.", "holds only textviews,buttons", "None of the above","it holds objects,widgets,labels,fields,icons,buttons etc.");
        this.addQuestion(q30);
        Question q31=new Question("Android is licensing under which open source licensing license?","Gnu's GPL", "Apache/MIT", "OSS", "None of the above","Apache/MIT");
        this.addQuestion(q31);
        Question q32=new Question("What was the google main business motivation for supporting Android?","To level the playing field for mobile deices", "To directly compete with iphone", "To corner the mobile device application market for licensing purposes", "To allow them to advertise more","To allow them to advertise more");
        this.addQuestion(q32);
        Question q33=new Question("What was the first phone released that ran the android?","Google gphone", "T-mobile G1", "Motorola droid", "HTC Hero","T-mobile G1");
        this.addQuestion(q33);
        Question q34=new Question("What is funny fact about android?","it was originally going to be called ufo", "The first version of android released withput an actual phone on the market", "we dont know","its main purpose was to unlock the door of a car","The first version of android released withput an actual phone on the market");
        this.addQuestion(q34);
        Question q35=new Question("What year was the open handset alliance announced?","2005", "2006", "2007", "2008","2007");
        this.addQuestion(q35);
        Question q36=new Question("what part of the android platform is open source?","low-level linux modules", "all of these answers the entire stack is an open source platform", "native libraries", "application framework","all of these answers the entire stack is an open source platform");
        this.addQuestion(q36);
        Question q37=new Question("When did google purchase Android?","2007", "2005", "2008", "2010","2005");
        this.addQuestion(q37);
        Question q38=new Question("Android releases since 1.5 has been given nicknames derived how?","Adjective and strange animals", "Food", "American states", "Not on a specific thing","food");
        this.addQuestion(q38);
        Question q39=new Question("Which piece of code used in Android is not open source?","Keypad drivers", "wifi drivers", "Audio drivers", "Power management","wifi drivers");
        this.addQuestion(q39);
        Question q40=new Question("Which among these is not a part of Android's Native libraries?","webkit", "dalvik", "OpenGl", "Sqlite","dalvik");
        this.addQuestion(q40);
        Question q41=new Question("Android is based on Linux for the following reasons?","Security", "Portability", "Networking", "All of these","All of these");
        this.addQuestion(q41);
        Question q42=new Question("What is the key difference with the distribution of apps for android based devices than the other mobile device platform applications?","Applications are distributed by Apple App store only", "Applications are distributed by multiple vendors with different policies on applications", "Applications are distributed by the android markets only", "None of the above","Applications are distributed by multiple vendors with different policies on applications");
        this.addQuestion(q42);
        Question q43=new Question("What was the main reason for replacing the java VM with the dalvik VM when the project began?","There was not enough memory capability", "Java VM was not free", "Java VM was too complicated to cofigure", "None of the above","Java VM was not free");
        this.addQuestion(q43);
        Question q44=new Question("What does an .apk file contain in android?","AndroidManifest.xml", ".dex files", "resources files", "all the above","all the above");
        this.addQuestion(q44);
        Question q45=new Question("How to call a subActivity in Application?","using threads", "using Intents", "using fragments", "using resources","using Intents");
        this.addQuestion(q45);
        Question q46=new Question("How many apps are available for android?","Above 90,000", "nearly 2,25,000", "above 10 millions", "below 50,000","Above 90,000");
        this.addQuestion(q46);
        Question q47=new Question("What is an Action in android?","The Intent Sender desires something or doing some task", "to perfrom a specific task in application", "to do a thing oppsite to app", "None of the above","The Intent Sender desires something or doing some task");
        this.addQuestion(q47);
        Question q48=new Question("does Android supports xml characters like >,<&#?","NO", "Yes", "We dont know", "Only supports >,<","NO");
        this.addQuestion(q48);
        Question q49=new Question("How does android system track the application?","Android system assigns each application a unique ID that is called Linux user ID.", "Using unique resources ID", "using java resources file", "None of the above","Android system assigns each application a unique ID that is called Linux user ID.");
        this.addQuestion(q49);
        Question q50=new Question("Does android support push email or is it pull?","Android 2.1 and above supports push e-mail for Exchange mail and Gmail.", "NO", "ALL versions of android support this features", "None of the above","Android 2.1 and above supports push e-mail for Exchange mail and Gmail.");
        this.addQuestion(q50);



    }


    // Adding new question
    public void addQuestion(Question quest) {

        ContentValues values = new ContentValues();
        values.put(KEY_QUESION, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOptionA());
        values.put(KEY_OPTB, quest.getOptionB());
        values.put(KEY_OPTC, quest.getOptionC());
        values.put(KEY_OPTD, quest.getOptionD());

        // Inserting Row
        myDatabase.insert(TABLE_QUESTION, null, values);
    }


}
