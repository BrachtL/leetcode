class Solution {
    fun isValid(s: String): Boolean {
        var counter1: Int = 0
        var counter2: Int = 0
        var counter3: Int = 0
        var pos1: Int = 0
        var pos2: Int = 0
        var pos3: Int = 0
        for (c in s) {
            if(c == ')') {
                counter1--
                if (pos1 == 1 && (counter1 < counter2 || counter1 < counter3)) {
                    println("aqui 1")
                    return false
                } else if(pos1 == 2 && ((counter1 < counter2 && counter1 < counter3))) {
                    println("aqui 2")
                    println("${counter1}, ${counter2}, ${counter3}")
                    return false
                } else if (pos1 == 3 && counter1 < 0) {
                    println("aqui 3")
                    return false
                } else if(counter1 < 0) {
                    return false
                } else if(counter1 == 0) {
                    pos1 = 0
                }
            } else if(c == ']') {
                counter2--
                if (pos2 == 1 && (counter2 < counter1 || counter2 < counter3)) {
                    println("aqui 4")
                    return false
                } else if(pos2 == 2 && ((counter2 < counter1 && counter2 < counter3))) {
                    println("aqui 5")
                    return false
                } else if (pos2 == 3 && counter2 < 0) {
                    println("aqui 6")
                    return false
                } else if(counter2 < 0) {
                    return false
                } else if(counter2 == 0) {
                    pos2 = 0
                }
            } else if(c == '}') {
                counter3--
                if (pos3 == 1 && (counter3 < counter1 || counter3 < counter2)) {
                    println("aqui 7")
                    return false
                } else if(pos3 == 2 && ((counter3 < counter1 && counter3 < counter2))) {
                    println("aqui 8")
                    println("${counter1}, ${counter2}, ${counter3}")
                    return false
                } else if (pos3 == 3 && counter3 < 0) {
                    println("aqui 9")
                    return false
                } else if(counter3 < 0) {
                    return false
                } else if(counter3 == 0) {
                    pos3 = 0
                }
            } else if(c == '(') {
                counter1++
                if(pos1 == 0) {
                    if (counter1 > counter2 && counter1 > counter3) {
                        pos1 = 1
                    } else if(counter1 > counter2 || counter1 > counter3) {
                        pos1 = 2
                    } else {
                        pos1 = 3
                    }
                }
            } else if(c == '[') {
                counter2++
                if(pos2 == 0) {
                    if (counter2 > counter1 && counter2 > counter3) {
                        pos2 = 1
                    } else if(counter2 > counter1 || counter2 > counter3) {
                        pos2 = 2
                    } else {
                        pos2 = 3
                    }
                }
            } else if(c == '{') {
                counter3++
                if(pos3 == 0) {
                    if (counter3 > counter1 && counter3 > counter2) {
                        pos3 = 1
                    } else if(counter3 > counter1 || counter3 > counter2) {
                        pos3 = 2
                    } else {
                        pos3 = 3
                    }
                }
            }
        }
        if ((counter1 + counter2 + counter3) > 0) {
            println("aqui 10")
            return false
        }
        return true
    }
}