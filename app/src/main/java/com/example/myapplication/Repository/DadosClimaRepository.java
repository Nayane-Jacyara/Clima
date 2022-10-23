package com.example.myapplication.Repository;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;


public class DadosClimaRepository {
    MutableLiveData<DadosClima> DadosClima;
    static DadosClimaRepository instancia;

    private DadosClimaRepository(){

    }

    public static DadosClimaRepository getInstance(){
        if (instancia == null){
            instancia = new DadosClimaRepository();
        }
        return instancia;
    }


    public liveData<DadosClima> getDadosClima(String latitude,String logitude){

        if(dadosClima == null){
            DadosClima = new MutableLiveData<>();
            DadosClima.setValeu(new DadosClima());
        }
        return DadosClimas;
    }

}
