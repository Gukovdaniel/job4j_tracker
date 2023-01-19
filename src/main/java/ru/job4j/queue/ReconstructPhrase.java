package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < evenElements.size(); i++) {
            sb.append(evenElements.poll());
            evenElements.poll();
        }
        return sb.toString();
        }

    private String getDescendingElements() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < descendingElements.size(); i++) {
            sb.append(descendingElements.pollLast());
        }
        return sb.toString();
    }


    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
