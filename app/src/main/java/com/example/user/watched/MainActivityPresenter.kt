package com.example.user.watched

class MainActivityPresenter {


    fun MainActivityPresenter(){
    }

    fun solve(value: MovieTypes): MovieTypes{
        if(value == MovieTypes.Action){
            return MovieTypes.Action
        }
        else{
            return MovieTypes.Horror
        }
    }
}