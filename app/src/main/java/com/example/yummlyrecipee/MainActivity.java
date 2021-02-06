package com.example.yummlyrecipee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private Response response;
    String display;
    String displayName;
    Bitmap images;
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new
                    StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        final TextView results= findViewById(R.id.results);
        final TextView results1= findViewById(R.id.results1);

        Button request= findViewById(R.id.request);

        requestQueue = Volley.newRequestQueue(this);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://yummly2.p.rapidapi.com/feeds/list?tag=list.recipe.popular&limit=18&start=0")
                        .get()
                        .addHeader("x-rapidapi-host", "yummly2.p.rapidapi.com")
                        .addHeader("x-rapidapi-key", "1c0b20f2b1msh1baa0bbd4f4cf64p111208jsnd769d95df320")
                        .build();

                try {
                    response = client.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(response.isSuccessful())
                {
                    try {
                        String myjsonstring =response.body().string();
                        results.setText(myjsonstring);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}