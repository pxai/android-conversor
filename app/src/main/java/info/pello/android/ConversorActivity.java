package info.pello.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ConversorActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button pickDate = (Button) findViewById(R.id.boton);
        pickDate.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	final EditText txtValor = (EditText) findViewById(R.id.valor);
        			String strValor = txtValor.getText().toString();
        			Double resultado = Double.parseDouble(strValor) * 166.386;
                	final TextView txtResultado = (TextView) findViewById(R.id.resultado);
                	txtResultado.setText("= "+ resultado);
        }
        });
    }
}