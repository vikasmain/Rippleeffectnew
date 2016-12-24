package com.bindass.dell.rippleeffect;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by dell on 12/2/2016.
 */
public class Mysingleton {
    private static Mysingleton mysingleton;
    private RequestQueue requestQueue;
    private static Context ctx;
public Mysingleton(Context context)
{
    ctx=context;
    requestQueue=getRequestQueue();
}
    public RequestQueue getRequestQueue()
{
    if(requestQueue==null)
    {
        requestQueue=Volley.newRequestQueue(ctx.getApplicationContext());

    }
    return requestQueue;
}
public static synchronized Mysingleton getInstance(Context context)
{
if(mysingleton==null)
{
    mysingleton=new Mysingleton(context);
}
return mysingleton;
}
public <T> void addtoreque(Request<T> request)
{
requestQueue.add(request);
}
}
