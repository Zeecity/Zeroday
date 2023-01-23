public class First {
    String[] items;
    int front, back;
    int size;

    First(int size) {
        items = new String[size];
        this.size = size;
        front = -1; //empty array
        back = -1;
    }

    boolean isfull() {
        if (front == 0 && back == size - 1) { //front has the first item and back has the index of the last item ie size-1
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    void enQueue(String element) {
        if (isfull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0; //mote: front is always 0
            }
            back++; //back is added to the index after front
            items[back] = element;
            System.out.println("Added " + element);
        }
    }

    String  deQueue() {
        String element;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            element = items[front];
            System.out.println(element + "Removed");
            if (front >= back) {
                front = -1;
                back = -1;
            } else {
                front++; //moves value of front forward
            }

        }
        return null;
    }

    String displayQueue() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Registered Courses");

            for (int i = front; i <= back; i++) {
                System.out.println(items[i]);
            }

        }
        return null;
    }

}

