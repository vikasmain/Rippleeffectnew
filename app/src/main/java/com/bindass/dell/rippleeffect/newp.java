package com.bindass.dell.rippleeffect;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by dell on 12/2/2016.
 */
public class newp extends Activity {


    String server_url = "https://mainhujyan.000webhostapp.com/andro1.php";

    String server_url2 = "https://mainhujyan.000webhostapp.com/andro2.php";

    String server_url3 = "https://mainhujyan.000webhostapp.com/andro3.php";

    String server_url4 = "https://mainhujyan.000webhostapp.com/andro4.php";

    String server_url5 = "https://mainhujyan.000webhostapp.com/andro5.php";
    String server_url_image = "https://mainhujyan.000webhostapp.com/androimage.png";
    String server_url_image2 = "https://mainhujyan.000webhostapp.com/androimage2.png";

    String server_url_image3 = "https://mainhujyan.000webhostapp.com/androimage3.png";

    String server_url_image4 = "https://mainhujyan.000webhostapp.com/androimage4.png";

    String server_url_image5 = "https://mainhujyan.000webhostapp.com/androimage5.png";

    TextView t2,t3,t4,t5,t6;
    ImageView imageView,imageView2,imageView3,imageView4,imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

t2=(TextView)findViewById(R.id.t1);
        imageView = (ImageView) findViewById(R.id.img1);
        t3=(TextView)findViewById(R.id.t2);
        imageView2 = (ImageView) findViewById(R.id.img2);

        t4=(TextView)findViewById(R.id.t3);
        imageView3 = (ImageView) findViewById(R.id.img3);

        t5=(TextView)findViewById(R.id.t4);
        imageView4 = (ImageView) findViewById(R.id.img4);
        t6=(TextView)findViewById(R.id.t5);
        imageView5 = (ImageView) findViewById(R.id.img5);

        final RequestQueue requestQueue = Volley.newRequestQueue(newp.this);

        ImageRequest imageRequest = new ImageRequest(server_url_image, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                imageView.setImageBitmap(response);
            }
        }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(newp.this, "networkerror", Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }
        });



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

        ImageRequest imageRequest2 = new ImageRequest(server_url_image2, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                imageView2.setImageBitmap(response);
            }
        }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(newp.this, "networkerror", Toast.LENGTH_SHORT).show();
                error.printStackTrace();
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
        ImageRequest imageRequest3 = new ImageRequest(server_url_image3, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                imageView3.setImageBitmap(response);
            }
        }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(newp.this, "networkerror", Toast.LENGTH_SHORT).show();
                error.printStackTrace();
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
        ImageRequest imageRequest4 = new ImageRequest(server_url_image4, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                imageView4.setImageBitmap(response);
            }
        }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(newp.this, "networkerror", Toast.LENGTH_SHORT).show();
                error.printStackTrace();
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
        ImageRequest imageRequest5 = new ImageRequest(server_url_image5, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                imageView5.setImageBitmap(response);
            }
        }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(newp.this, "Netwokerror", Toast.LENGTH_SHORT).show();
                error.printStackTrace();
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
        Mysingleton.getInstance(newp.this).addtoreque(imageRequest);
        requestQueue.add(stringRequest2);
        Mysingleton.getInstance(newp.this).addtoreque(imageRequest2);
        requestQueue.add(stringRequest3);
        Mysingleton.getInstance(newp.this).addtoreque(imageRequest3);
        requestQueue.add(stringRequest4);
        Mysingleton.getInstance(newp.this).addtoreque(imageRequest4);
        requestQueue.add(stringRequest5);
        Mysingleton.getInstance(newp.this).addtoreque(imageRequest5);
    }

}