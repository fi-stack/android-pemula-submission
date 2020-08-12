package com.dicoding.picodiploma.submissionandroidpemula.model

import com.dicoding.picodiploma.submissionandroidpemula.R

object CharactersData {
    private val characterNames = arrayOf(
        "Gary",
        "Karen",
        "Mr. Krabs",
        "Mrs. Puff",
        "Patrick",
        "Pearl",
        "Plankton",
        "Sandy",
        "Spongebob",
        "Squidward"
    )

    private val characterDetails = arrayOf(
        "Gary the Snail (voiced by Tom Kenny) is SpongeBob's pet sea snail who lives with him in their pineapple home and vocalizes like a cat. Despite only communicating through meows, other characters can understand and talk to him. Depicted as a level-headed character, Gary often serves as a voice of reason and a foil to SpongeBob and solves problems that his owner cannot. He has a pink shell that is impossibly spacious on the inside.",
        "Karen Plankton (voiced by Jill Talley) are the owners of the Chum Bucket, an unsuccessful restaurant located across the street from the Krusty Krab. Their business is a commercial failure because they sell mostly inedible foods made from chum. Plankton is a small planktonic copepod and the self-proclaimed archenemy of Mr. Krabs. His ultimate goal is to steal Krabs' secret formula for Krabby Patties and run the Krusty Krab out of business but never permanently succeeds. He is a skilled inventor and possesses a Napoleon complex due to his short stature. Karen is Plankton's own invention, a former security system turned into a sentient supercomputer who assists him with evil plans to steal Krabs' secret recipe. She is married to Plankton and usually takes residence in the Chum Bucket laboratory.",
        "Eugene Krabs (voiced by Clancy Brown), more commonly known as Mr. Krabs, is a red crab who owns and operates the Krusty Krab restaurant where SpongeBob works. He is self-content, cunning, and obsessed with the value and essence of money. He lives in an anchor-shaped house with his teenage daughter Pearl, who is a whale. He dislikes spending money but will go to great lengths to make Pearl happy. He tends to worry more about his riches than about the needs of his employees. Having served in the navy, he loves sailing, whales, sea shanties, and talking like a pirate.",
        "Mrs. Puff (voiced by Mary Jo Catlett) is a paranoid pufferfish who is SpongeBob's teacher at boating school, an underwater driver's education facility where students drive boats like cars. She wears a sailor suit and her school is a lighthouse. SpongeBob is Mrs. Puff's most dedicated student and knows the answer to every question on her written and oral exams, but always panics and crashes when he actually boards a vessel. She puffs up into a ball when she is scared or injured.",
        "Patrick Star (voiced by Bill Fagerbakke) is a pink starfish who lives under a rock and wears flowered swim trunks. His most prominent character trait is his extremely low intelligence. He is best friends with SpongeBob and often unknowingly encourages activities that get the two into trouble. While typically unemployed throughout the series, Patrick holds various short-term jobs as the storyline of each episode requires. He is generally slow and easy-going but can sometimes get aggressive, much like real starfish, and occasionally performs feats of great strength.",
        "Pearl Krabs (voiced by Lori Alan) is a teenage sperm whale and Mr. Krabs' daughter. She wants to fit in with her fish peers, but finds this impossible to do because of the large size inherent to her species. She will inherit the Krusty Krab from her father when she grows older, but is still in high school and does not yet have a job at the family business. Pearl's favorite activities are working at the Bikini Bottom Mall, using her father's credit card to buy anything that is in style, and listening to pop music.",
        "Sheldon Plankton (voiced by Mr. Lawrence) are the owners of the Chum Bucket, an unsuccessful restaurant located across the street from the Krusty Krab. Their business is a commercial failure because they sell mostly inedible foods made from chum. Plankton is a small planktonic copepod and the self-proclaimed archenemy of Mr. Krabs. His ultimate goal is to steal Krabs' secret formula for Krabby Patties and run the Krusty Krab out of business but never permanently succeeds. He is a skilled inventor and possesses a Napoleon complex due to his short stature. Karen is Plankton's own invention, a former security system turned into a sentient supercomputer who assists him with evil plans to steal Krabs' secret recipe. She is married to Plankton and usually takes residence in the Chum Bucket laboratory.",
        "Sandy Cheeks (voiced by Carolyn Lawrence) is a squirrel from Texas who lives in an air-filled glass dome and wears a diving suit to breathe underwater. Whenever any aquatic creatures enter her home, they must wear helmets of water. Sandy works as a scientist, explorer, and inventor. She is a rodeo champion with a number of athletic interests, such as \"sand-boarding\" and karate. She speaks with a Southern drawl and uses typical Southern slang words and phrases.",
        "SpongeBob SquarePants (voiced by Tom Kenny) is a yellow anthropomorphic sea sponge who usually wears brown short pants, a white collared shirt, and a red tie. He lives in a pineapple house and is employed as a fry cook at a fast food restaurant called the Krusty Krab. He diligently attends Mrs. Puff's Boating School but has never passed; his lack of a driver's license is a running gag throughout the series. He is relentlessly optimistic and enthusiastic toward his job and his friends. SpongeBob's hobbies include catching jellyfish, blowing bubbles, playing with his best friend Patrick, and unintentionally irritating his neighbor Squidward. He first appears in \"Help Wanted\".",
        "Squidward Tentacles (voiced by Rodger Bumpass) is an octopus with a large nose who works as a cashier at the Krusty Krab. He is SpongeBob's next-door neighbor with a dry, sarcastic sense of humor. He believes himself to be a talented artist and musician, but nobody else recognizes his abilities. He plays the clarinet and often paints self-portraits in different styles, which he hangs up around his moai house. Squidward frequently voices his frustration with SpongeBob, but he genuinely cares for him deep down. This has been revealed in the form of sudden confessions when Squidward is in a dire situation."
    )

    private val charactersImages = intArrayOf(
        R.drawable.gary,
        R.drawable.karen,
        R.drawable.mrkrab,
        R.drawable.mrspuff,
        R.drawable.patrick,
        R.drawable.pearl,
        R.drawable.plankton,
        R.drawable.sandy,
        R.drawable.spongebob,
        R.drawable.squidward
    )

    val listData: ArrayList<Character>
        get() {
            val list = arrayListOf<Character>()
            for (position in characterNames.indices) {
                val character = Character()
                character.name = characterNames[position]
                character.detail = characterDetails[position]
                character.photo = charactersImages[position]
                list.add(character)
            }
            return list
        }
}