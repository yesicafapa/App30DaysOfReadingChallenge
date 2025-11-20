package com.example.app30days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app30days.ui.theme.App30DaysTheme
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App30DaysTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ReadingScreen()
                }
            }
        }
    }
}

data class ReadingDay(
    val day: String,
    val title: String,
    val description: String,
    val imageRes: Int
)


val readingItems = listOf(
    ReadingDay(
        day = "Day 1",
        title = "Laut Bercerita",
        description = "Buku ini ditulis oleh Leila S. Chudori. Kisah aktivis muda yang hilang di masa Orde Baru, memperlihatkan luka sejarah Indonesia dari sisi kemanusiaan dan cinta keluarga.",
        imageRes = R.drawable.gambar1
    ),
    ReadingDay(
        day = "Day 2",
        title = "Bumi Manusia",
        description = "Buku ini ditulis oleh Pramoedya Ananta Toer. Minke, pemuda cerdas di zaman kolonial, menulis kisah perjuangan dan kesadaran bangsanya lewat cinta dan pena.",
        imageRes = R.drawable.gambar2
    ),
    
    ReadingDay(
        day = "Day 3",
        title = "Laskar Pelangi",
        description = "Buku ini ditulis oleh Andrea Hirata. Kisah anak-anak Belitung yang berjuang menuntut ilmu di tengah keterbatasan. Inspiratif dan penuh harapan.",
        imageRes = R.drawable.gambar3
    ),
    ReadingDay(
        day = "Day 4",
        title = "Negeri 5 Menara",
        description = "Buku ini ditulis oleh Ahmad Fuadi. Enam santri dengan mimpi besar belajar di pesantren. Filosofi “Man Jadda Wajada” jadi kekuatan utama mereka.",
        imageRes = R.drawable.gambar4
    ),
    ReadingDay(
        day = "Day 5",
        title = "Ronggeng Dukuh Paruk",
        description = "Buku ini ditulis oleh Ahmad Tohari. Tentang Srintil, perempuan ronggeng yang menjadi simbol budaya, penderitaan, dan kekuatan perempuan desa.",
        imageRes = R.drawable.gambar5
    ),
    ReadingDay(
        day = "Day 6",
        title = "Perahu Kertas",
        description = "Buku ini ditulis oleh Dee Lestari. Cinta dan impian dua jiwa seni yang terpisah oleh realita hidup, dikisahkan lembut dengan gaya khas Dee.",
        imageRes = R.drawable.gambar6
    ),
    ReadingDay(
        day = "Day 7",
        title = "Tentang Kamu",
        description = "Buku ini ditulis oleh Tere Liye. Kisah Zaman, perempuan tangguh yang hidupnya penuh perjuangan, diungkap lewat perjalanan seorang pengacara muda.",
        imageRes = R.drawable.gambar7
    ),
    ReadingDay(
        day = "Day 8",
        title = "Hujan",
        description = "Buku ini ditulis oleh Tere Liye. Di masa futuristik, Lail dan Esok belajar arti kehilangan, cinta, dan waktu. Puitis serta mengharukan.",
        imageRes = R.drawable.gambar8
    ),
    ReadingDay(
        day = "Day 9",
        title = "Sebuah Seni untuk Bersikap Bodo Amat",
        description = "Buku ini ditulis oleh Mark Manson. Pengembangan diri yang realistis dan lucu tentang memilih apa yang penting untuk diperjuangkan.",
        imageRes = R.drawable.gambar9
    ),
    ReadingDay(
        day = "Day 10",
        title = "Filosofi Teras",
        description = "Buku ini ditulis oleh Henry Manampiring. Mengajarkan bagaimana menjadi tenang dan rasional melalui filosofi Stoikisme dalam kehidupan modern.",
        imageRes = R.drawable.gambar10
    ),
    ReadingDay(
        day = "Day 11",
        title = "Dilan 1990",
        description = "Buku ini ditulis oleh Pidi Baiq. Kisah cinta remaja Bandung tahun 90-an yang manis, lucu, dan penuh nostalgia.",
        imageRes = R.drawable.gambar11
    ),
    ReadingDay(
        day = "Day 12",
        title = "Critical Eleven",
        description = "Buku ini ditulis oleh Ika Natassa. Tentang cinta yang diuji oleh waktu, ego, dan kenyataan pernikahan. Penuh dialog tajam dan emosi.",
        imageRes = R.drawable.gambar12
    ),
    ReadingDay(
        day = "Day 13",
        title = "Koala Kumal",
        description = "Buku ini ditulis oleh Raditya Dika. Cerita humor dan refleksi diri tentang patah hati, disampaikan dengan gaya kocak khas Raditya.",
        imageRes = R.drawable.gambar13
    ),
    ReadingDay(
        day = "Day 14",
        title = "Bumi",
        description = "Buku ini ditulis oleh Tere Liye. Awal kisah petualangan Raib, Seli, dan Ali dalam dunia paralel yang penuh misteri dan kekuatan.",
        imageRes = R.drawable.gambar14
    ),
    ReadingDay(
        day = "Day 15",
        title = "Selamat Tinggal",
        description = "Buku ini ditulis oleh Tere Liye. Satir cerdas tentang dunia akademik, plagiarisme, dan perjuangan menemukan makna karya orisinal.",
        imageRes = R.drawable.gambar15
    ),
    ReadingDay(
        day = "Day 16",
        title = "Supernova: Ksatria, Puteri, dan Bintang Jatuh",
        description = "Buku ini ditulis oleh Dee Lestari. Perpaduan sains, cinta, dan spiritualitas dalam kisah misterius dua penulis dan ciptaan mereka.",
        imageRes = R.drawable.gambar16
    ),
    ReadingDay(
        day = "Day 17",
        title = "Cantik Itu Luka",
        description = "Buku ini ditulis oleh Eka Kurniawan. Kisah magis dan tragis tentang keluarga Dewi Ayu di masa kolonial, penuh simbol dan humor gelap.",
        imageRes = R.drawable.gambar17
    ),
    ReadingDay(
        day = "Day 18",
        title = "Orang-Orang Biasa",
        description = "Buku ini ditulis oleh Andrea Hirata. Lima sahabat kecil dari kampung yang nekat melakukan pencurian untuk membantu teman mereka.",
        imageRes = R.drawable.gambar18
    ),
    ReadingDay(
        day = "Day 19",
        title = "Surat Kecil untuk Tuhan",
        description = "Buku ini ditulis oleh Agnes Davonar. Kisah nyata tentang perjuangan Gita melawan kanker dengan keteguhan hati dan kasih keluarga.",
        imageRes = R.drawable.gambar19
    ),
    ReadingDay(
        day = "Day 20",
        title = "Catatan Juang",
        description = "Buku ini ditulis oleh Fiersa Besari. Kumpulan catatan inspiratif yang mengingatkan kita untuk tetap berjuang dan menjadi manusia yang lebih baik.",
        imageRes = R.drawable.gambar20
    ),
    ReadingDay(
        day = "Day 21",
        title = "Garis Waktu",
        description = "Buku ini ditulis oleh Fiersa Besari. Puisi dan prosa indah tentang cinta, waktu, dan kehilangan.",
        imageRes = R.drawable.gambar21
    ),
    ReadingDay(
        day = "Day 22",
        title = "Rantau 1 Muara",
        description = "Buku ini ditulis oleh Ahmad Fuadi. Penutup trilogi Negeri 5 Menara yang menggambarkan arti “pulang” dan pencarian makna hidup.",
        imageRes = R.drawable.gambar22
    ),
    ReadingDay(
        day = "Day 23",
        title = "Ayah",
        description = "Buku ini ditulis oleh Andrea Hirata. Kisah tentang ayah dan anak, cinta, dan perjuangan hidup di tengah kemiskinan.",
        imageRes = R.drawable.gambar23
    ),
    ReadingDay(
        day = "Day 24",
        title = "Partikel",
        description = "Buku ini ditulis oleh Dee Lestari. Petualangan sains dan spiritualitas dalam perjalanan seorang fotografer alam liar bernama Zarah.",
        imageRes = R.drawable.gambar24
    ),
    ReadingDay(
        day = "Day 25",
        title = "Rectoverso",
        description = "Buku ini ditulis oleh Dee Lestari. Cerita pendek dan lagu yang menggambarkan sisi lembut manusia tentang cinta dan kehilangan.",
        imageRes = R.drawable.gambar25
    ),
    ReadingDay(
        day = "Day 26",
        title = "Sabtu Bersama Bapak",
        description = "Buku ini ditulis oleh Adhitya Mulya. Kisah haru keluarga yang terhubung lewat pesan-pesan seorang ayah yang sudah tiada.",
        imageRes = R.drawable.gambar26
    ),
    ReadingDay(
        day = "Day 27",
        title = "Madre",
        description = "Buku ini ditulis oleh Dee Lestari. Tentang warisan, roti, dan penemuan jati diri yang manis dan hangat.",
        imageRes = R.drawable.gambar27
    ),
    ReadingDay(
        day = "Day 28",
        title = "Pulang",
        description = "Buku ini ditulis oleh Leila S. Chudori. Tentang eksil politik Indonesia dan kerinduan mendalam pada tanah air.",
        imageRes = R.drawable.gambar28
    ),
    ReadingDay(
        day = "Day 29",
        title = "Sang Pemimpi",
        description = "Buku ini ditulis oleh Andrea Hirata. Lanjutan Laskar Pelangi, penuh semangat dan cita-cita tinggi dua anak Belitung.",
        imageRes = R.drawable.gambar29
    ),
    ReadingDay(
        day = "Day 30",
        title = "99 Cahaya di Langit Eropa",
        description = "Buku ini ditulis oleh Hanum Salsabiela Rais & Rangga Almahendra. Kisah perjalanan spiritual yang membuka wawasan tentang Islam di Eropa dengan gaya narasi ringan.",
        imageRes = R.drawable.gambar30
    )
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReadingScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "30 Days of Reading Challenge",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = paddingValues,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            items(readingItems) { item ->
                ReadingCard(item)
                Spacer(Modifier.height(12.dp))
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReadingCard(data: ReadingDay) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { expanded = !expanded }
            .animateContentSize(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {

        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()
        ) {


            Column(modifier = Modifier.fillMaxWidth().padding(top = 8.dp)) {

                Text(
                    text = data.day,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.primary
                )

                Spacer(Modifier.height(4.dp))

                Text(
                    text = data.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }


            Spacer(Modifier.height(12.dp))

            Image(
                painter = painterResource(id = data.imageRes),
                contentDescription = data.title,
                modifier = Modifier
                    .width(LocalConfiguration.current.screenWidthDp.dp * 0.5f)
                    .align(Alignment.CenterHorizontally)
                    .aspectRatio(3f / 4f)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(Modifier.height(8.dp))


            if (expanded) {
                Divider()
                Spacer(Modifier.height(12.dp))
                Text(
                    text = "Sinopsis: ${data.description}",
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Justify // <<< Tambahkan baris ini
                )
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}