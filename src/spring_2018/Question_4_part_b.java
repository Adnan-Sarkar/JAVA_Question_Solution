package spring_2018;

class Voter {
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof Voter) {
            Voter v = (Voter)obj;

            if(this.age == v.age && this.voterId.equals(v.voterId)) {
                result = true;
            }
        }
        return result;
    }
}
