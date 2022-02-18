import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StopWatchDIsplay(
    formattedTime : String,
    onStartClick: () -> Unit,
    onPauseClick : () -> Unit,
    OnResetClick : () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = formattedTime,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.Black
        )
        Spacer(modifier.height(16.dp))
        Row(
           horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ){
            Button(onStartClick,colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green, contentColor = Color.White)){
                Text("Start")
            }
            Spacer(Modifier.width(16.dp))
            Button(onPauseClick){
                Text("Pause")
            }
            Spacer(Modifier.width(16.dp))
            Button(OnResetClick, colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red, contentColor = Color.White)){
                Text("Reset")
            }
        }
    }
}