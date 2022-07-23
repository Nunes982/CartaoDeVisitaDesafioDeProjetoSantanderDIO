package com.example.cartaodevisitadesafiodeprojeto

import android.app.Application
import com.example.cartaodevisitadesafiodeprojeto.data.AppDatabase
import com.example.cartaodevisitadesafiodeprojeto.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}