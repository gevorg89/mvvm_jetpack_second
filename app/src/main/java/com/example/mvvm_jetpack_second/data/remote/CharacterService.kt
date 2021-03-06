package com.example.mvvm_jetpack_second.data.remote

import com.example.mvvm_jetpack_second.data.entities.Character
import com.example.mvvm_jetpack_second.data.entities.CharacterList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {
    @GET("character")
    suspend fun getAllCharacters() : Response<CharacterList>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<Character>
}