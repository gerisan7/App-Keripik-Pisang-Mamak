package com.example.uts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataMahasiswa extends AppCompatActivity {

    //Deklarasi Variable
    private TextView GetNIM, GetNama, GetJurusan, GetSemester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);
        getSupportActionBar().setTitle("Data Mahasiswa");
        GetNIM = findViewById(R.id.getnim);
        GetNama = findViewById(R.id.getnama);
        GetJurusan = findViewById(R.id.getjurusan);
        GetSemester = findViewById(R.id.getsemester);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");

        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (nama){
            case "Profile Developer":
                GetNIM.setText("NIM: 09031181722073");
                GetNama.setText("Nama: Geri Santoso");
                GetJurusan.setText("Jurusan: Sistem Informasi");
                GetSemester.setText("Semester: 5");
                break;

            case "Varian Rasa":
                GetNIM.setText("1. Rasa Coklat");
                GetNama.setText("2. Rasa Keju");
                GetJurusan.setText("");
                GetSemester.setText("");
                break;

            case "Harga Keripik Pisang Mamak":
                GetNIM.setText("Keripik Original : Rp.10.000");
                GetNama.setText("Keripik Pisang Rasa Coklat : Rp.11.0000");
                GetJurusan.setText("Keripik Pisang Rasa Keju : Rp.12.000");
                GetSemester.setText("");
                break;

            case "Jenis Pisang Yang Cocok Untuk di Olah Untuk Keripik":
                GetNIM.setText("Pisang Nangka");
                GetNama.setText("Pisang Ambon");
                GetJurusan.setText("Pisang Tanduk");
                GetSemester.setText("Pisang Kepok");
                break;

            case "Adam":
                GetNIM.setText("NIM: 17720008");
                GetNama.setText("Nama: Adam Makmur");
                GetJurusan.setText("Jurusan: Fakultas Ilmu Komunikasi");
                GetSemester.setText("Semester: 8");
                break;
        }
    }
}
