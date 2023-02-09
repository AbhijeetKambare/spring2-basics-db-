package com.example.spring2basic;

import jakarta.persistence.*;

@Entity
@Table(name = "Library_cards")
public class card {
    @Id
    private int card_id;
    private int fine;
    private int bookissueded;

    @Enumerated(value = EnumType.STRING) //restrcting the user input to only String which are defined in enum class
    private Cardstatus cardstatus;

    @OneToOne//mapping relation
    @JoinColumn//you are telling that add forign key and define column name of parent class join primary key by default
    User user;

    public card(int card_id, int fine, int bookissed) {
        this.card_id = card_id;
        this.fine = fine;
        this.bookissueded = bookissed;
    }

    public card() {
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getBookissed() {
        return bookissueded;
    }

    public void setBookissed(int bookissed) {
        this.bookissueded = bookissed;
    }

    public Cardstatus getCardstatus() {
        return cardstatus;
    }

    public void setCardstatus(Cardstatus cardstatus) {
        this.cardstatus = cardstatus;
    }
}
