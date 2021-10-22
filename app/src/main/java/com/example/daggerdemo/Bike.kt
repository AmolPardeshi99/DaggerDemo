package com.example.daggerdemo

import android.util.Log
import javax.inject.Inject

class Bike @Inject constructor(wheels: Wheels,engine: Engine,suspension: Suspension) {
fun driveBike(){
    Log.d("Amol", "driveBike: Driving Bike ");
}

}