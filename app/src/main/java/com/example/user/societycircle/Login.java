package com.example.user.societycircle;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;



/**
 * Created by my hp on 4/9/2016.
 */
public class Login extends AppCompatActivity implements View.OnClickListener {

    String username, password;
    ProgressDialog pd;
    EditText pwd;
    //SharedPreferences user_info;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_login);
        setSupportActionBar(toolbar);
       /* user_info = getSharedPreferences("userinfo", 0);*/
        pwd=(EditText)findViewById(R.id.edtPassword);
        pwd.setInputType(InputType.TYPE_CLASS_TEXT |InputType.TYPE_TEXT_VARIATION_PASSWORD);
        //pwd.setTextColor(Color.BLUE);


        findViewById(R.id.btnLogin).setOnClickListener(this);
        pd = new ProgressDialog(Login.this);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.setMessage("Loading....");


    }

    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.btnLogin:
              /*  Class i = null;
                try {
                    i = Class.forName("com.example.myhp.bloodbank.Bloodmain");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent k = new Intent(getApplicationContext(), i);
                startActivity(k);
                break;*/
                pd.show();
                username = ((EditText) findViewById(R.id.edtUserName)).getText().toString();
                password = ((EditText) findViewById(R.id.edtPassword)).getText().toString();


               /*
                String url = "http://licensemarvel.esy.es/login.php";



                //Creating a string request


                StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                pd.hide();
                                Toast.makeText(com.example.user.societycircle.Login.this, response, Toast.LENGTH_LONG).show();
                                SharedPreferences.Editor edit=user_info.edit();
                                edit.putString("response",response);
                                edit.commit();

                                Class i = null;
                                try {
                                    i = Class.forName("com.example.myhp.digitalindia.Services");
                                } catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                }
                                Intent k = new Intent(getApplicationContext(), i);
                                startActivity(k);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                //You can handle error here if you want
                                pd.hide();
                                Toast.makeText(com.example.user.societycircle.Login.this, "its not working", Toast.LENGTH_LONG).show();
                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> params = new HashMap<>();
                        //Adding parameters to request
                        params.put("username",username);
                        params.put("password",password);

                        //returning parameter
                        return params;
                    }
                };

                //Adding the string request to the queue
                RequestQueue requestQueue = Volley.newRequestQueue(this);
                requestQueue.add(stringRequest);

                int socketTimeout = 20000;//20 seconds - change to what you want
                RetryPolicy policy = new DefaultRetryPolicy(socketTimeout, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                stringRequest.setRetryPolicy(policy);
                break;
        }
        */
        }


    }



}
