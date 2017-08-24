package com.example.bruno.projetocalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button[] botoes = new Button[16];
    private TextView visor;
    private String parcela1;
    private String parcela2;
    private String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associando os botões
        botoes[0] = (Button)findViewById(R.id.btn1);
        botoes[1] = (Button)findViewById(R.id.btn2);
        botoes[2] = (Button)findViewById(R.id.btn3);
        botoes[3] = (Button)findViewById(R.id.btnSum);
        botoes[4] = (Button)findViewById(R.id.btn4);
        botoes[5] = (Button)findViewById(R.id.btn5);
        botoes[6] = (Button)findViewById(R.id.btn6);
        botoes[7] = (Button)findViewById(R.id.btnDif);
        botoes[8] = (Button)findViewById(R.id.btn7);
        botoes[9] = (Button)findViewById(R.id.btn8);
        botoes[10] = (Button)findViewById(R.id.btn9);
        botoes[11] = (Button)findViewById(R.id.btnTimes);
        botoes[12] = (Button)findViewById(R.id.btnC);
        botoes[13] = (Button)findViewById(R.id.btn0);
        botoes[14] = (Button)findViewById(R.id.btnEqual);
        botoes[15] = (Button)findViewById(R.id.btnDiv);

        //Associando a tela
        visor = (TextView)findViewById(R.id.edtTelaCalculadora);
        visor.setEnabled(false);
        visor.setText("");

        parcela1 = "";
        parcela2 = "";
        operador = "";

    }

    //Criando métodos para os botões
    public void onClickBtn0(View v){
        visor.setText(visor.getText()+"0");
        if(this.operador.length()==0){
            parcela1+="0";
        }else{
            parcela2+="0";
        }
    }

    public void onClickBtn1(View v){
        visor.setText(visor.getText()+"1");
        if(this.operador.length()==0){
            parcela1+="1";
        }else{
            parcela2+="1";
        }
    }

    public void onClickBtn2(View v){
        visor.setText(visor.getText()+"2");
        if(this.operador.length()==0){
            parcela1+="2";
        }else{
            parcela2+="2";
        }
    }

    public void onClickBtn3(View v){
        visor.setText(visor.getText()+"3");
        if(this.operador.length()==0){
            parcela1+="3";
        }else{
            parcela2+="3";
        }
    }

    public void onClickBtn4(View v){
        visor.setText(visor.getText()+"4");
        if(this.operador.length()==0){
            parcela1+="4";
        }else{
            parcela2+="4";
        }
    }

    public void onClickBtn5(View v){
        visor.setText(visor.getText()+"5");
        if(this.operador.length()==0){
            parcela1+="5";
        }else{
            parcela2+="5";
        }
    }

    public void onClickBtn6(View v){
        visor.setText(visor.getText()+"6");
        if(this.operador.length()==0){
            parcela1+="6";
        }else{
            parcela2+="6";
        }
    }

    public void onClickBtn7(View v){
        visor.setText(visor.getText()+"7");
        if(this.operador.length()==0){
            parcela1+="7";
        }else{
            parcela2+="7";
        }
    }

    public void onClickBtn8(View v){
        visor.setText(visor.getText()+"8");
        if(this.operador.length()==0){
            parcela1+="8";
        }else{
            parcela2+="8";
        }
    }

    public void onClickBtn9(View v){
        visor.setText(visor.getText()+"9");
        if(this.operador.length()==0){
            parcela1+="9";
        }else{
            parcela2+="9";
        }
    }

    public void onClickBtnSum(View v){
        visor.setText(visor.getText()+"+");
        operador = "+";
    }

    public void onClickBtnDif(View v){
        visor.setText(visor.getText()+"-");
        operador = "-";
    }

    public void onClickBtnTimes(View v){
        visor.setText(visor.getText()+"*");
        operador = "*";
    }

    public void onClickBtnDiv(View v){
        visor.setText(visor.getText()+"/");
        operador = "/";
    }

    public void onClickBtnEqual(View v){
        if(parcela2.length()>0) {
            int p1 = Integer.parseInt(parcela1);
            int p2 = Integer.parseInt(parcela2);
            int resultado = 0;
            switch (operador) {

                case "+":
                    resultado = p1 + p2;
                    break;
                case "-":
                    resultado = p1 - p2;
                    break;
                case "*":
                    resultado = p1 * p2;
                    break;
                case "/":
                    resultado = p1 / p2;
                    break;
            }
            parcela1 = String.valueOf(resultado);
            parcela2 = "";
            visor.setText(String.valueOf(resultado));
        }else{
            Toast.makeText(this,"Necessário informar a segunda parcela",Toast.LENGTH_SHORT).show();
        }


    }

    public void onClickBtnC(View v){
        parcela1 = "";
        parcela2 = "";
        operador = "";
        visor.setText("");
    }

}
