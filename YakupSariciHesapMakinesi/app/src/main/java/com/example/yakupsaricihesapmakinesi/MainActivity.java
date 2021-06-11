package com.example.yakupsaricihesapmakinesi;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.yakupsaricihesapmakinesi.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

       Button btn0;
       Button  btn1;
       Button  btn2;
       Button  btn3;
       Button  btn4;
       Button  btn5;
       Button  btn6;
       Button  btn7;
       Button  btn8;
       Button  btn9;
       Button  btnTopla;
       Button  btnCikar;
       Button  btnBol;
       Button  btnCarp;
       Button  btnEsittir;
       Button  btnVirgul;
       Button  btnSifirla;
       Button btnkare ;
       Button btnkup ;
       Double ilkSayi;
     TextView hesapEkrani;
     Boolean virgulDurum;
    String islemDurum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnTopla = findViewById(R.id.btnTopla);
        btnCikar = findViewById(R.id.btnCikar);
        btnBol = findViewById(R.id.btnBol);
        btnCarp = findViewById(R.id.btnCarp);
        btnEsittir = findViewById(R.id.btnEsittir);
        btnSifirla = findViewById(R.id.buttonSifirla);
        btnVirgul = findViewById(R.id.btnVirgul);
        btnkare = findViewById(R.id.btnkare);
        hesapEkrani = findViewById(R.id.hesapEkrani);
        btnkup = findViewById(R.id.btnkup);

        hesapEkrani.setText("0");
        ilkSayi = 0.0;
        virgulDurum = false;
        islemDurum = "0";

        btnkare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ilkSayi= Double.parseDouble(hesapEkrani.getText().toString());
                ilkSayi = ilkSayi*ilkSayi;
                hesapEkrani.setText(ilkSayi.toString());

            }
        });
        btnkup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkSayi= Double.parseDouble(hesapEkrani.getText().toString());
                ilkSayi = ilkSayi*ilkSayi*ilkSayi;
                hesapEkrani.setText(ilkSayi.toString());

            }
        });
        btnEsittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("=");
            }
        });
        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("+");
            }
        });
        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("-");
            }
        });
        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("*");
            }
        });
        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("/");
            }
        });
        btnSifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("sifirla");
            }
        });
        btnVirgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL(",");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(0);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(9);
            }
        });
    }
    private void TIKLA_NUMARA(int sayi)
    {
        if(hesapEkrani.getText().toString() == "0"){
            hesapEkrani.setText("");
        }
        else if(
                hesapEkrani.getText().toString() == "+" ||
                        hesapEkrani.getText().toString() == "*" ||
                        hesapEkrani.getText().toString() == "/"||
                        hesapEkrani.getText().toString() == "-"        )
        {
            hesapEkrani.setText("");
        }
        hesapEkrani.setText(hesapEkrani.getText() + String.valueOf(sayi));
    }
    private void TIKLA_SEMBOL(String sembol) {
        switch (sembol) {
            default: {
                if (hesapEkrani.getText().toString() == "+" || hesapEkrani.getText().toString() == "*"
                        || hesapEkrani.getText().toString() == "/" || hesapEkrani.getText().toString() == "-" || hesapEkrani.getText().toString() == "**") {
                    if (islemDurum == "*" || islemDurum == "/")
                        ilkSayi = -1 * ilkSayi;

                    hesapEkrani.setText(sembol);
                    islemDurum = sembol;
                }
                else {
                    ilkSayi = Double.parseDouble(hesapEkrani.getText().toString());
                    hesapEkrani.setText(sembol);
                    islemDurum = sembol;
                }
                hesapEkrani.setText(sembol);
                islemDurum = sembol;
            }
            break;


            case "sifirla": {
                ilkSayi = 0.0;
                hesapEkrani.setText("0");
                islemDurum = "0";
            }
            break;
            case "=": {
                if (hesapEkrani.getText().toString() == "+" || hesapEkrani.getText().toString() == "*"
                        || hesapEkrani.getText().toString() == "/" || hesapEkrani.getText().toString() == "-") {

                } else {
                    switch (islemDurum) {
                        default: {
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;
                        case "+": {
                            ilkSayi = ilkSayi + Double.parseDouble(hesapEkrani.getText().toString());
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;
                        case "-": {
                            ilkSayi = ilkSayi - Double.parseDouble(hesapEkrani.getText().toString());
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;

                        case "/": {
                            ilkSayi = ilkSayi / Double.parseDouble(hesapEkrani.getText().toString());
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;
                        case "*": {
                            ilkSayi = ilkSayi * Double.parseDouble(hesapEkrani.getText().toString());
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;
                    }
                }


            }
            break;
            case ",": {

            }
            break;
        }
    }
}