package com.example.recyclerview.data

import com.example.recyclerview.data.model.Data

object DataHelper {
    fun getDataList(): List<Data>{
        val dataList: ArrayList<Data> = ArrayList()
        (1..100).forEach {
            val dataModel = Data("${it}.Serhad", "Mert")
            dataList.add(dataModel)
        }
        return dataList
    }
}