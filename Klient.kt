class Klient(var marka:String,
             var data:String,
             var idtovar:Int,
             var name:String) {

    fun Input(a:Tovaroved){
        a.marka= readLine().toString()
        a.data= readLine().toString()
        a.idtovar= readLine()!!.toInt()
        a.name= readLine().toString()
    }

    fun Give_Info(a:Tovaroved){
        println("Марка: "+a.marka)
        println("Дата производства: "+a.data)
        println("Id товара: "+a.idtovar)
        println("Название товара: "+a.idtovar)

    }

}