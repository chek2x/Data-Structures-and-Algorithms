public class TestStack {
    public static void main(String[] args) {
        Stack st = new Stack(3);
        System.out.println(st.getCapacity());
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.push(3);
        st.push(21);
        st.push(78);
        st.push(18);
        System.out.println(st.display());
        st.setCapacity(5);
        System.out.println(st.getCapacity());
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.pop();
        System.out.println(st.display());
    }
}
