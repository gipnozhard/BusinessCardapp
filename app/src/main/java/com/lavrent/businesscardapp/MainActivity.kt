package com.lavrent.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lavrent.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview() // Функция предпоказа, в ней сама составная функция находится, решил просто так написать
                }
            }
        }
    }
}

@Composable
fun CardOne() { // Первая карточка
    Column( // Столбец карточки
        horizontalAlignment = Alignment.CenterHorizontally // Выравнивание по середине в горизонте
    ) {
        Box(Modifier // Создал контейнер для отображения отступов в котором находится иконка, можно опустить этот момент и здать картинкку по высоте иширине
            .padding(
                top = 10.dp,
                bottom = 10.dp,
                start = 100.dp,
                end = 100.dp
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_face_retouching_natural_black_48), // Иконка лица находится в ресурсах
                contentDescription = null, // Описание рисунка или иконки , обязательный параметр, можно его опустить, поставить null
                Modifier
                    .size( // Модификатор размер иконки
                        height = 120.dp,
                        width = 200.dp
                ),
                tint = Color.Blue // Оттенок иконки
            )
        }
        Text( // Текст первый карточки
            text = stringResource(R.string.lavrentyev_pavel), // Текст описан в ресурсах string
            fontSize = 40.sp, // Размер шрифта
            fontWeight = FontWeight.Bold, // Жирный шрифт
            fontStyle = FontStyle.Italic, // Стиль шрифта
            color = Color.Black // Цвет текста
        )
        Text( // Текст второй карточки
            text = stringResource(R.string.android_developer), // Текст описан в ресурсах string
            fontSize = 20.sp, // Размер шрифта
            fontWeight = FontWeight.Bold, // Жирный шрифт
            color = Color.Green // Цвет текста
        )
    }
}

@Composable
fun CardTwo(modifier: Modifier = Modifier) { // Вторая карточка
    Column( // Столбец
        Modifier
            .height(190.dp), // Высота всего контейнера столбца
        verticalArrangement = Arrangement.Bottom // Выравнивание вниз по вертикали
    ) {
        Row(modifier // Первый ряд
            .padding( // Отступы контенера ряд
                top = 10.dp,
                bottom = 10.dp,
                start = 40.dp,
                end = 40.dp
            )
            .height(35.dp) // Высота ряда
        ) {
            Column( // Контейнер стобца(по сути, можно было взять обычный Box), нужен указть вес в ряду, отступы относительно элемента рядом в ряду
                Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                horizontalAlignment = Alignment.End // Элементы или элемент занимает по горизонтали крайнее правое положение отностльно контенера и его отступов
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_call_black_48),
                    contentDescription = null, // Описание рисунка или иконки , обязательный параметр, можно его опустить, поставить null
                    tint = Color.DarkGray // Оттенок иконки
                )
            }
            Column(
                Modifier.weight(2f) // Вес контейнера относильно ряда
            ) {
                Text( // Первый текст карточки 2
                    text = stringResource(R.string.tel), // Текст описан в ресурсах string
                    fontSize = 20.sp, // Размер шрифта
                    color = Color.Black // Цвет текста
                )
            }
        }
        Row(modifier  // Второй ряд
            .padding( // Отступы контенера ряд
                top = 10.dp,
                bottom = 10.dp,
                start = 40.dp,
                end = 40.dp
            )
            .height(35.dp) // Высота ряда
        ) {
            Column( // Контейнер стобца(по сути, можно было взять обычный Box), нужен указть вес в ряду, отступы относительно элемента рядом в ряду
                Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                horizontalAlignment = Alignment.End // Элементы или элемент занимает по горизонтали крайнее правое положение отностльно контенера и его отступов
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = null, // Описание рисунка или иконки , обязательный параметр, можно его опустить, поставить null
                    tint = Color.Green, // Оттенок иконки

                )
            }
            Column(
                Modifier.weight(2f) // Вес контейнера относильно ряда
            ) {
                Text( // Второй текст карточки 2
                    text = stringResource(R.string.https_github_com_gipnozhard), // Текст описан в ресурсах string
                    fontSize = 18.sp, // Размер шрифта
                    color = Color.Black // Цвет текста
                )
            }
        }
        Row(modifier // Третий ряд
            .padding( // Отступы контенера ряд
                top = 10.dp,
                bottom = 10.dp,
                start = 40.dp,
                end = 40.dp
            )
            .height(35.dp) // Высота ряда
        ) {
            Column( // Контейнер стобца(по сути, можно было взять обычный Box), нужен указть вес в ряду, отступы относительно элемента рядом в ряду
                Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                horizontalAlignment = Alignment.End // Элементы или элемент занимает по горизонтали крайнее правое положение отностльно контенера и его отступов
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_email_black_48),
                    contentDescription = null, // Описание рисунка или иконки , обязательный параметр, можно его опустить, поставить null
                    tint = Color.Magenta // Оттенок иконки
                )
            }
            Column(
                Modifier.weight(2f) // Вес контейнера относильно ряда
            ) {
                Text( // Третий текст карточки 2
                    text = stringResource(R.string.pa_lavrentyev_gmail_com), // Текст описан в ресурсах string
                    fontSize = 17.sp, // Размер шрифта
                    color = Color.Black // Цвет текста
                )
            }
        }
    }
}

@Composable
fun Greeting() { // Общая составная функция в Compose
    Column( // Контейнер столбец
        Modifier
            .background(Color(0xFF8F9779)), // Цвет фона
        verticalArrangement = Arrangement.Bottom // Вертикально выравнивание элементов контейнера по нижнему краю
    ) {
        CardOne() // Карточка один
        Spacer(modifier = Modifier.height(100.dp)) // Функция пропуска, пробела с высотой 100 пикселей
        CardTwo() // Карточка два
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Greeting() //Составная функция предтавленная в функции представления(предпоказа)
    }
}