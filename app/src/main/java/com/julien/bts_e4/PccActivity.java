package com.julien.bts_e4;
import android.support.v7.app.AppCompatActivity;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.julien.bts_e4.R.layout.pcc;
import static java.lang.Math.random;


public class PccActivity extends AppCompatActivity{

    public int var_a = 0;
    public int var_b = 0;
    private Button ciseaux;
    private Button papier;
    private Button pierre;
    private Button stat;
    private TextView res;
    private TextView ordi;
    private TextView resultat;
    private String random;
    private String rep;
    View rootView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(pcc);
        initJeux();
        jeux();
    }

    private void initJeux(){
        //container = (LinearLayout) findViewById(R.id.world_container);
        ciseaux = (Button) findViewById(R.id.btn_ciseaux);
        papier = (Button) findViewById(R.id.btn_papier);
        pierre = (Button) findViewById(R.id.btn_pierre);
        stat = (Button) findViewById(R.id.btn_résultats);

        res = (TextView) findViewById(R.id.tv_joueur_1);
        ordi = (TextView) findViewById(R.id.tv_joueur_2);
        resultat = (TextView) findViewById(R.id.tv_résultat);

    }

    private void jeux() {
        ciseaux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("Ciseaux");
                Random choix = new Random();
                int a = choix.nextInt(3);
                if (a == 1) {
                    rep = "Ciseaux";
                } else {
                    if (a == 2) {
                        rep = "Pierre";
                    } else {
                        rep = "Papier";
                    }
                }
                ordi.setText(rep);
                if (rep.equals("Ciseaux")) {
                    random = "Egalité";
                } else {
                    if (rep.equals("Pierre")) {
                        random = "L'ordinateur à gagné";
                        var_b = var_b + 1;
                    } else {
                        random = "Le joueur à gagné";
                        var_a = var_a + 1;
                    }

                }
                resultat.setText(random);


            }
        });
        pierre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("Pierre");
                Random choix = new Random();
                int a = choix.nextInt(3);
                if (a == 1) {
                    rep = "Ciseaux";
                } else {
                    if (a == 2) {
                        rep = "Pierre";
                    } else {
                        rep = "Papier";
                    }
                }
                ordi.setText(rep);
                if (rep.equals("Pierre")) {
                    random = "Egalité";
                } else {
                    if (rep.equals("Papier")) {
                        random = " L'ordinateur à gagné";
                        var_b = var_b + 1;

                    } else {
                        random = "Le joueur à gagné";
                        var_a = var_a + 1;
                    }
                }
                resultat.setText(random);
            }
        });
        papier.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          res.setText("Papier");
                                          Random choix = new Random();
                                          int a = choix.nextInt(3);
                                          if (a == 1) {
                                              rep = "Ciseaux";
                                          } else {
                                              if (a == 2) {
                                                  rep = "Pierre";
                                              } else {
                                                  rep = "Papier";
                                              }
                                          }
                                          ordi.setText(rep);
                                          if (rep.equals("Papier")) {
                                              random = "Égalité";
                                          } else {
                                              if (rep.equals("Ciseaux")) {
                                                  random = " L'ordinateur à gagné";
                                                  var_b = var_b + 1;
                                              } else {
                                                  random = "Le joueur à gagné";
                                                  var_a = var_a + 1;
                                              }
                                          }
                                          resultat.setText(random);
                                      }
                                  }
        );
    }



}