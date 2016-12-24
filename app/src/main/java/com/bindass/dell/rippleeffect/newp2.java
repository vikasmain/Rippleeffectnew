package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by dell on 12/2/2016.
 */
public class newp2 extends Activity {
    String server_url = "https://mainhujyan.000webhostapp.com/hack2.php";

    String server_url2 = "https://mainhujyan.000webhostapp.com/hack1.php";

    String server_url3 = "https://mainhujyan.000webhostapp.com/hack3.php";

    String server_url4 = "https://mainhujyan.000webhostapp.com/hack4.php";

    String server_url5 = "https://mainhujyan.000webhostapp.com/hack5.php";


    TextView t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);

        t2=(TextView)findViewById(R.id.t11);
        t3=(TextView)findViewById(R.id.t12);

        t4=(TextView)findViewById(R.id.t13);


        t5=(TextView)findViewById(R.id.t14);

        t6=(TextView)findViewById(R.id.t15);


        final RequestQueue requestQueue = Volley.newRequestQueue(newp2.this);





        StringRequest stringRequest=new StringRequest(Request.Method.POST, server_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                t2.setText(response);
                requestQueue.stop();

            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                t2.setText("something went wrong");
                error.printStackTrace();
                requestQueue.stop();
            }

        });



        StringRequest stringRequest2=new StringRequest(Request.Method.POST, server_url2, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                t3.setText(response);
                requestQueue.stop();

            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                t3.setText("something went wrong");
                error.printStackTrace();
                requestQueue.stop();
            }

        });




        StringRequest stringRequest3=new StringRequest(Request.Method.POST, server_url3, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                t4.setText(response);
                requestQueue.stop();

            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                t4.setText("something went wrong");
                error.printStackTrace();
                requestQueue.stop();
            }

        });




        StringRequest stringRequest4=new StringRequest(Request.Method.POST, server_url4, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                t5.setText(response);
                requestQueue.stop();

            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                t5.setText("something went wrong");
                error.printStackTrace();
                requestQueue.stop();
            }

        });




        StringRequest stringRequest5=new StringRequest(Request.Method.POST, server_url5, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                t6.setText(response);
                requestQueue.stop();

            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                t6.setText("something went wrong");
                error.printStackTrace();
                requestQueue.stop();
            }

        });
        requestQueue.add(stringRequest);
        requestQueue.add(stringRequest2);

        requestQueue.add(stringRequest3);

        requestQueue.add(stringRequest4);

        requestQueue.add(stringRequest5);

    }

}