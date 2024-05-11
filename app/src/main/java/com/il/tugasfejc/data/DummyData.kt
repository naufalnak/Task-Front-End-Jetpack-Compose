package com.il.tugasfejc.data

import com.il.tugasfejc.R
import com.il.tugasfejc.model.Galery
import com.il.tugasfejc.model.Tayang
import com.il.tugasfejc.model.Trend


object DummyData {
    val dataTayang = listOf(
        Tayang(
            id = 1,
            name = "Kamen Rider Gotchard",
            nickname = "仮面ライダーガッチャード, Kamen Raidā Gatchādo",
            explain = "Japanese Tokusatsu-drama in Toei Company's Kamen Rider Series. It is the fifth series to debut in the Reiwa Era and the thirty-eighth overall. The series premiered on September 3, 2023, joining Ohsama Sentai King-OhgerIcon-crosswiki in the Super Hero TimeIcon-crosswiki lineup after the finale of Kamen Rider Geats. After King-Ohger concluded, Gotchard was joined in the Super Hero Time line-up by Bakuage Sentai BoonboomgerIcon-crosswiki on March 3, 2024.",
            photo = R.drawable.tayang1,
            photodetail = R.drawable.tayangdetail1
        ),
        Tayang(
            id = 2,
            name = "Bakuage Sentai Boonboomger",
            nickname = "爆上戦隊ブンブンジャー Bakuage Sentai Bunbunjā",
            explain = "Japanese Tokusatsu-drama and the 48th installment in Toei Company's Super Sentai Series. The series premiered March 3, 2024, joining Kamen Rider GotchardIcon-crosswiki in the Super Hero TimeIcon-crosswiki line-up after the finale of Ohsama Sentai King-Ohger. The show’s theme is vehicles, customization, and racing.",
            photo = R.drawable.tayang2,
            photodetail = R.drawable.tayangdetail2
        ),
        Tayang(
            id = 3,
            name = "Ultraman Blazar",
            nickname = "ウルトラマンブレーザー, Urutoraman Burēzā",
            explain = "The titular hero of the series Ultraman Blazar.[4][5] He was first known as a mysterious being sighted by Earth's astronauts, becoming an urban legend among them, before he bonded with Gento Hiruma, who later became captain of the newly formed SKaRD.",
            photo = R.drawable.tayang3,
            photodetail = R.drawable.tayangdetail3
        ),
    )

    val dataTrend = listOf(
        Trend(
            id = 1,
            name = "Kamen Rider The Winter Movie: \n" +
                    "Gotchard & Geats Strongest Chemy Great Gotcha Operation",
            photo = R.drawable.trend1,
            nickname = "仮面ライダー THE WINTER MOVIE ガッチャード＆ギーツ 最強ケミー★ガッチャ大作戦",
            explain = "Japanese superhero Tokusatsu crossover film between Kamen Rider Gotchard and Kamen Rider Geats, and is the 14th Movie War. In the film, Ace, Houtaro, and their allies participate in a game to capture the Level 10 Chemys. The film also features Rinne Kudo's debut as Kamen Rider Majade ahead of her televised debut in Episode 19.",
            photodetail = R.drawable.detailtrend1
        ),
        Trend(
            id = 2,
            name = "Ninpuu Sentai Hurricaneger Degozaru!\n" +
                    "Shushuuto 20th Anniversary",
            photo = R.drawable.trend2,
            nickname = "忍風戦隊ハリケンジャーでござる！ シュシュッと20th Anniversary Ninpū Sentai Harikenjā Degozaru! Shushutto Tsuentiethu Anivu~āsarī",
            explain = "Japanese superhero V-Cinema film that serves to commemorate the 20th anniversary of Ninpu Sentai Hurricaneger.",
            photodetail = R.drawable.detailtrend2
        ),
        Trend(
            id = 3,
            name = "Ninpuu Sentai Hurricaneger Degozaru!\n" +
                    "Shushuuto 20th Anniversary",
            photo = R.drawable.trend2,
            nickname = "忍風戦隊ハリケンジャーでござる！ シュシュッと20th Anniversary Ninpū Sentai Harikenjā Degozaru! Shushutto Tsuentiethu Anivu~āsarī",
            explain = "Japanese superhero V-Cinema film that serves to commemorate the 20th anniversary of Ninpu Sentai Hurricaneger.",
            photodetail = R.drawable.detailtrend2
        ),
    )

    val dataGallery = listOf(
        Galery(
            id = 1,
            name = "Kamen Rider",
            photo = R.drawable.kamenrider
        ),
        Galery(
            id = 2,
            name = "Super Sentai",
            photo = R.drawable.supersentai
        ),
        Galery(
            id = 3,
            name = "Ultraman",
            photo = R.drawable.ultraman
        ),
        Galery(
            id = 4,
            name = "Garo",
            photo = R.drawable.garo
        ),
        Galery(
            id = 5,
            name = "Power Ranger",
            photo = R.drawable.powerranger
        )
    )
}