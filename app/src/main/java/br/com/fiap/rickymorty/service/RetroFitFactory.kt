package br.com.fiap.rickymorty.service

import br.com.fiap.rickymorty.ui.theme.model.ListaPersonagens
import br.com.fiap.rickymorty.ui.theme.model.Personagem
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitFactory {

    private val BASE_URL = "https://rickandmortyapi.com/api/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getListaDePersonagensService(): PersonagemService {
        return retrofitFactory.create(PersonagemService::class.java)
    }

    fun getPersonagemPorId(): PersonagemService {
        return retrofitFactory.create(PersonagemService::class.java)
    }
}