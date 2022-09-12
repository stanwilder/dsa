package codechallenges.linkedlist.stacksAndQueues;

public class Brackets {
  public static boolean validateBrackets(String bracket) {
    boolean results = false;
    Stack<Character> bStack = new Stack<>();
    Queue<Character> validate = new Queue<>();
    for (Character ch : bracket.toCharArray()) {
      if ((ch.toString().equals("(")) ||
        (ch.toString().equals(")")) ||
        (ch.toString().equals("{")) ||
        (ch.toString().equals("}")) ||
        (ch.toString().equals("[")) ||
        (ch.toString().equals("]"))) {
        bStack.push(ch);
      }
    }
    while (!bStack.isEmpty()){
      validate.enqueue(bStack.pop());
    }
    while ((validate.size > 1)){
      System.out.println(validate.front);
      String nextValue = (validate.front.next.value).toString();
      switch ((validate.front.value).toString()){
        case ")":
          if (nextValue.equals("("))
            results = true;
          break;

        case "}":
            if (nextValue.equals("{"))
              results = true;
            break;
          default:
            results = false;
            break;
        case "]":
          if (nextValue.equals("["))
            results = true;
          break;
      }
      validate.dequeue();
    }
    return results;
  }
}
