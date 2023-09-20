package br.com.fiap.rickymorty.service

import br.com.fiap.rickymorty.ui.theme.model.ListaPersonagens
import br.com.fiap.rickymorty.ui.theme.model.Personagem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PersonagemService {

    // https://rickandmortyapi.com/api/character
    @GET("character")
    fun getListaPersonagens(): Call<ListaPersonagens>

    // https://rickandmortyapi.com/api/character/98
    @GET("character/{id}")
    fun getPersonagemPorId(@Path("id") id: Int): Call<Personagem>

}