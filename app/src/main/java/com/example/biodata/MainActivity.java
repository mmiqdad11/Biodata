package com.example.biodata;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edNama, edAlm, edNohp;
    Button bSign;
    String nm, alm, hp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*@Override
        public boolean onCreateOptionsMenu(Menu menu) {

            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.optionmenu, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId()==R.id.inset){
                startActivity(new Intent(this, InsertActivity.class));
            } else if (item.getItemId() == R.id.edit) {
                startActivity(new Intent(this, EditActivity.class));
            }
            return true;
        }
        */




        edNama = findViewById(R.id.editnm);
        edAlm = findViewById(R.id.editalm);
        edNohp = findViewById(R.id.editnohp);
        bSign = findViewById(R.id.btnok);

        bSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nm = edNama.getText().toString();
                alm = edAlm.getText().toString();
                hp = edNohp.getText().toString();

                if (nm.isEmpty() || alm.isEmpty() || hp.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Data Harus Lengkap",
                            Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil",
                            Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}
