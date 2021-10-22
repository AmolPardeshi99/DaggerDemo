package com.example.daggerdemo

import dagger.Component


@Component
interface CarComponent {

    fun getBike():Bike
}