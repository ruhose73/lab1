package com.example.lab1

class StringExc{

    var maxSize = 0;
    var maxSentence: String = ""
    val text = "Mauris faucibus porttitor tincidunt. Sed orci libero, efficitur id eleifend sit amet, hendrerit quis nibh. Cras et commodo lectus. Maecenas condimentum semper condimentum non, mollis viverra massa. Donec cursus maximus gravida. Pellentesque vitae cursus magna, at egestas nulla. Ut eget augue eget magna mattis convallis a sed nisl. Donec ut porta lorem, et dapibus dolor. Pellentesque ac erat tortor."

    var sentences = text.split(".", "?", "!").filter{ it.isNotEmpty() }

    fun smt(): String{
        for (sentence in sentences) {
            var words = sentence.split(" ").filter{ it.all { it.isLetter() } }
            var numOfWords = words.count()
            if(numOfWords>maxSize) {
                maxSize=numOfWords
                maxSentence=sentence
            }
        }
        return maxSentence
    }
}
