package com.ahmetutlu.oop

class Piano:HouseDecor ,Instrument{
    var brand:String?=null
    val digital:Boolean?=null
    override var roommate: String
        get() = "kitchen"
        set(value) {}
}