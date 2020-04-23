package com.example.send_whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendWhatsAppMessageTo(View view) {

//        Uri uri = Uri.parse("smsto:" + "+918762623837");
//        Intent sendIntent = new Intent(Intent.ACTION_SENDTO, uri);
//        sendIntent.putExtra(Intent.EXTRA_TEXT, "Hai Good Morning");
//        sendIntent.setPackage("com.whatsapp");
//        startActivity(sendIntent);
//




        String phoneNumberWithCountryCode = "+918762623837";
        String message = "Hallo";

        startActivity(
                new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                String.format("https://api.whatsapp.com/send?phone=%s&text=%s", phoneNumberWithCountryCode, message)
                        )
                )
        );



//        String number= "+918762623837";
//
//        Uri uri = Uri.parse("smsto:" + number);
//        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
//        i.setPackage("com.whatsapp");
//        startActivity(Intent.createChooser(i, ""));

    }
}
