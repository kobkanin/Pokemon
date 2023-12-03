data class Pokemon(
    val id: Int,
    val name: Name,
    val type: List<String>,
    val hp: Int,
    val attack: Int,
    val defense: Int,
    val speed: Int,
    val imageUrl: String
)

data class Name(
    val english: String,
    val japanese: String
)

fun mockPokemonList(): List<Pokemon> =
    listOf(
        Pokemon(
            id = 1,
            name = Name(
                english = "Bulbasaur",
                japanese = "フシギダネ"
            ),
            type = listOf(
                "Grass",
                "Poison"
            ),
            hp = 45,
            attack = 49,
            defense = 49,
            speed = 45,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/001.png"
        ),
        Pokemon(
            id = 2,
            name = Name(
                english = "Ivysaur",
                japanese = "フシギソウ"
            ),
            type = listOf(
                "Grass",
                "Poison"
            ),
            hp = 60,
            attack = 62,
            defense = 63,
            speed = 60,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/002.png"
        ),
        Pokemon(
            id = 3,
            name = Name(
                english = "Venusaur",
                japanese = "フシギバナ"
            ),
            type = listOf(
                "Grass",
                "Poison"
            ),
            hp = 80,
            attack = 82,
            defense = 83,
            speed = 80,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/003.png"
        ),
        Pokemon(
            id = 4,
            name = Name(
                english = "Charmander",
                japanese = "ヒトカゲ"
            ),
            type = listOf(
                "Fire"
            ),
            hp = 39,
            attack = 52,
            defense = 43,
            speed = 65,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/004.png"
        ),
        Pokemon(
            id = 5,
            name = Name(
                english = "Charmeleon",
                japanese = "リザード"
            ),
            type = listOf(
                "Fire"
            ),
            hp = 58,
            attack = 64,
            defense = 58,
            speed = 80,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/005.png"
        ),
        Pokemon(
            id = 6,
            name = Name(
                english = "Charizard",
                japanese = "リザードン"
            ),
            type = listOf(
                "Fire",
                "Flying"
            ),
            hp = 78,
            attack = 84,
            defense = 78,
            speed = 100,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/006.png"
        ),
        Pokemon(
            id = 7,
            name = Name(
                english = "Squirtle",
                japanese = "ゼニガメ"
            ),
            type = listOf(
                "Water",
            ),
            hp = 44,
            attack = 48,
            defense = 65,
            speed = 43,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/007.png"
        ),
        Pokemon(
            id = 8,
            name = Name(
                english = "Wartortle",
                japanese = "カメール"
            ),
            type = listOf(
                "Water",
            ),
            hp = 59,
            attack = 63,
            defense = 80,
            speed = 58,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/008.png"
        ),
        Pokemon(
            id = 9,
            name = Name(
                english = "Blastoise",
                japanese = "カメックス"
            ),
            type = listOf(
                "Water",
            ),
            hp = 79,
            attack = 83,
            defense = 100,
            speed = 78,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/009.png"
        ),
        Pokemon(
            id = 10,
            name = Name(
                english = "Caterpie",
                japanese = "キャタピー"
            ),
            type = listOf(
                "Bug",
            ),
            hp = 45,
            attack = 30,
            defense = 35,
            speed = 45,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/010.png"
        ),
        Pokemon(
            id = 11,
            name = Name(
                english = "Metapod",
                japanese = "トランセル"
            ),
            type = listOf(
                "Bug",
            ),
            hp = 50,
            attack = 20,
            defense = 55,
            speed = 30,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/011.png"
        ),
        Pokemon(
            id = 12,
            name = Name(
                english = "Butterfree",
                japanese = "バタフリー"
            ),
            type = listOf(
                "Bug",
                "Flying"
            ),
            hp = 60,
            attack = 45,
            defense = 50,
            speed = 70,
            imageUrl = "https://raw.githubusercontent.com/Purukitto/pokemon-data.json/master/images/pokedex/hires/012.png"
        )
    )