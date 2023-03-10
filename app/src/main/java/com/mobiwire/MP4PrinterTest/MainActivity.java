package com.mobiwire.MP4PrinterTest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.zxing.BarcodeFormat;
import com.mobiwire.CSAndroidGoLib.AndroidGoCSApi;
import com.mobiwire.CSAndroidGoLib.CsPrinter;


public class MainActivity extends AppCompatActivity {
   EditText editText;
   Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.text1);
        btn = findViewById(R.id.btn1);

        new AndroidGoCSApi(this);

        printText();
    }

    public void printText(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CsPrinter printer=new CsPrinter();
                printer.addTextToPrint(editText.getText().toString(),null,20,true,false,0);
                printer.print(MainActivity.this);
            }
        });


    }


    public void cashPowerPrint(View view){
        CsPrinter printer=new CsPrinter();
        printer.addTextToPrint("JAH POWER",null,50,true,false,1);
        printer.addTextToPrint("-----",null,50,true,false,1);
        printer.addTextToPrint("2023-01-04 11:38:01",null,20,true,false,0);
        printer.addTextToPrint("RECEIPT NO .:","202301EIN000000004",20,true,false,0);
        printer.addTextToPrint("METER NO .:","345678987",20,true,false,0);
        printer.addTextToPrint("ABOUCARR JALLOW",null,20,true,false,0);
        printer.addTextToPrint("655678445665",null,20,true,false,0);
        printer.addTextToPrint("Electricity Credit",null,30,true,false,1);
        printer.addTextToPrint("Token Number",null,20,true,false,1);
        printer.addTextToPrint("--------------------",null,20,true,false,1);
        printer.addTextToPrint("2345-3455-2345-5562",null,50,true,false,1);
        printer.addTextToPrint("--------------------",null,20,true,false,1);
        printer.addTextToPrint("Amount Paid .:","GMD 50",20,true,false,0);
        printer.addTextToPrint("Service Fee .:","GMD 5",20,true,false,0);
        printer.addTextToPrint("Cashpower Amount .:","GMD 45",20,true,false,0);
        printer.addTextToPrint("Total Units","4.4KWH",20,true,false,0);
        printer.addTextToPrint("Operator","Cherno Jallow",20,true,false,0);
        printer.addTextToPrint("Use Energy Wisely!",null,20,true,false,1);
        printer.addTextToPrint("TX,Phone: +220 3750915 - 2068611 ","GMD 50",20,true,false,1);
        printer.addTextToPrint("Web: www.tglobal.co",null,20,true,false,1);
        printer.print(MainActivity.this);


    }
    public void print(View view) {

        CsPrinter printer=new CsPrinter();

        printer.addTextToPrint("????????????????",null,20,true,false,0);
        printer.addBitmapFromRawToPrint(this,R.raw.etranetuttr_logo);
        printer.addTextToPrint("LOTTO",null,50,true,false,1);
        printer.addTextToPrint("TEST LOTTO",null,30,true,false,1);
        printer.addTextToPrint("Terminal Id","100000",25,true,false,1);
        printer.addTextToPrint("Draw No","528 09/08/00",25,true,false,1);
        printer.addTextToPrint("Draw Time","03:30 PM",25,true,false,1);
        printer.addTextToPrint("Validity","01/01/00",25,true,false,1);

        printer.addTextToPrint("------------",null,25,true,false,1);


        printer.addTextToPrint("P2 AT N50",null,25,true,false,0);
        printer.addTextToPrint("01 02 03 04",null,25,true,false,0);

        printer.addTextToPrint("??????????????","PHP300",25,true,false,1);
        printer.addTextToPrint("TID :100000TID :100000",null,25,true,false,0);

        printer.addTextToPrint("WELCOME",null,25,true,false,0);
        printer.addTextToPrint("TEST PROMO",null,25,true,false,0);

       printer.addBarQrCodeToPrint("TEST", BarcodeFormat.QR_CODE, 384, 280);

       printer.print(this);

    }



}
