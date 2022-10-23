package com.example.myapplication.modules;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LiveData;

import com.example.myapplication.DadosClimaRepository;

public class DadosClimaViewModel extends ViewModel{

    public LiveData<DadosClima> getDadosClima(String latitude, String logitude){
        return DadosClimaRepository.GetInstancia().getDadosClima(latitude,logitude);


    }
}
