class Twofer {
    String twofer(String name) {
        if(name == null){
            return "One for you, one for me.";
        } else{
            return String.format("One for %s, one for me.", name);
        }
    }
}

// Diff approach 1: (concatenation is faster than using String.format)
// public class Twofer {
//     public String twofer(String name) {
//         if (name == null){
//             return "One for you, one for me.";
//         } else {
//             return "One for " + name + ", one for me.";
//         }
//     }
// }

//Diff approach 2: (can be further compacted using ternaries)
// public class Twofer {
//     public String twofer(String name) {
//         return "One for " + (name == null ? "you" : name) + ", one for me.");
//     }
// }