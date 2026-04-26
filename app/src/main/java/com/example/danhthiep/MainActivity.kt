package com.example.danhthiep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danhthiep.ui.theme.DanhThiepTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DanhThiepTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color= MaterialTheme.colorScheme.background) {
                    DanhThiep()
                }
            }
        }
    }
}

@Composable
fun DanhThiep(){
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFD2E8D4)),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = "Android Logo", modifier = Modifier.size(100.dp).background(Color(0xFF072042)).padding(8.dp)
            )
            Text(
                text = "Sinh viên lớp CNTT CT1C",
                color = Color(0xFF3DDC84),
                fontSize = 24.sp
            )
        }
        Column(modifier = Modifier.padding(bottom = 48.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)) {
            DongLienHe(iconld=R.drawable.dienthoai, text= "+84 82 220 7050")
            DongLienHe(iconld = R.drawable.chiase, text= "@ThanhThao")
            DongLienHe(iconld=R.drawable.gmail, text="vuthao4803@gmail.com")
        }
    }
}
@Composable
fun DongLienHe(iconld : Int, text: String){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(iconld),
            contentDescription = null,
            tint = Color(0xFF3DDC84),
            modifier = Modifier.padding(end = 36.dp).size(34.dp)
        )
        Text(
            text=text,
            fontSize = 24.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DanhThiepPreview() {
    DanhThiepTheme {
        DanhThiep()
    }
}