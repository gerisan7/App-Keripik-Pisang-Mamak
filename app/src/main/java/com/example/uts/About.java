package com.example.uts;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ListView list = (ListView) findViewById(R.id.ListView);
        String[] namaGeri = {"                      Nama         = GERI SANTOSO                         ", "                      NIM             = 09031181722073                         ","                      JURUSAN    = SI Reg 5A                         ","Keripik Pisang Mamak","Keripik Pisang Mamak","Keripik Pisang Mamak","Keripik Pisang Mamak","Keripik Pisang Mamak","Keripik Pisang Mamak","Keripik Pisang Mamak","Keripik Pisang Mamak","Keripik Pisang Mamak","Keripik Pisang Mamak"};
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, namaGeri);
        list.setAdapter(myAdapter);

    }
}
