package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class MainActivity extends AppCompatActivity {

    DadosClimaViewModel climaViewModel;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInlate());

        View view = binding.getRoot();
        setContentView(view);

        climaViewModel = new ViewModelProvider(this).get(DadosViewModel.class);
        climaViewModel.getDadosClima();

    }
        public void Recuperar (View view){
            EdiText Latitude =  binding.Latitude;
            EdiText Logitude =  binding.Logitude;
           DadosClimaViewModel.getDadosClima(Latitude.getText().toString(), Logitude.getText().toString());
           System.out.println(Latitude.getText().toString()+ Logitude.getText().toString());
        }
}