package com.example.wechat2

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private val date = listOf("苹果","香蕉","荔枝","龙眼","莲雾","哈密瓜","红玫瑰","禧龙","家威","观池","春晓","春晓","春晓","春晓","春晓","春晓")
    private val fruitList= ArrayList<Fruit>()

    fun initFruits(){
        repeat(1)
        {
            fruitList.add(Fruit("文件传输助手","[图片]",R.drawable.dd2))
            fruitList.add(Fruit("今晚打阿威","王禧龙：[动画表情]",R.drawable.dd6))
            fruitList.add(Fruit("麦当劳","狂省76元 十一欢聚桶...",R.drawable.dd5))
            fruitList.add(Fruit("微信支付","微信支付凭证",R.drawable.dd7))
            fruitList.add(Fruit("微信运动","不支持类型消息",R.drawable.dd1))
            fruitList.add(Fruit("Apple","发现一枚全能 ACE,快来...",R.drawable.dd4))
            fruitList.add(Fruit("微信游戏","官方群限时招募抽永久时装",R.drawable.dd3))
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFruits()





        //上下文，列表子视图，数据源
//        val adapter = ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,date)
        val fruitAdapter= FruitAdapter(this,R.layout.fruit_item,fruitList)
        //绑定到控件
//        listViewTest.adapter=adapter;
        listViewTest.adapter = fruitAdapter;


        listViewTest.setOnItemClickListener{ _, _, i, _ ->
            val fruit = fruitList[i]
            Toast.makeText(this,fruit.name,Toast.LENGTH_SHORT).show()
        }
    }

//////书中练习

//    private val fruitList = ArrayList<Fruit>()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.demo_01)
//        initFruits()
//        val layoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = layoutManager
//        val daapter = FruitAdapter(fruitList)
//        recyclerView.adapter = adapter
//    }
//
//  private  fun initFruits(){
//        repeat(2)
//        {
//            fruitList.add(Fruit("鼠",R.drawable.animal_0))
//            fruitList.add(Fruit("牛",R.drawable.animal_1))
//            fruitList.add(Fruit("虎",R.drawable.animal_2))
//            fruitList.add(Fruit("兔",R.drawable.animal_3))
//            fruitList.add(Fruit("龙",R.drawable.animal_4))
//            fruitList.add(Fruit("蛇",R.drawable.animal_5))
//            fruitList.add(Fruit("马",R.drawable.animal_6))
//            fruitList.add(Fruit("羊",R.drawable.animal_7))
//            fruitList.add(Fruit("猴",R.drawable.animal_8))
//            fruitList.add(Fruit("鸡",R.drawable.animal_9))
//            fruitList.add(Fruit("狗",R.drawable.animal_10))
//            fruitList.add(Fruit("猪",R.drawable.animal_11))
//        }
//    }
}