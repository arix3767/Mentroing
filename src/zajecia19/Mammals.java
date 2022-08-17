package zajecia19;

public class Mammals {
    private double body_wt;
    private double brain_wt;
    private double non_dreaming;
    private double dreaming;
    private double total_sleep;
    private double life_span;
    private double gestation;
    private int predation;
    private int exposure;
    private int danger;

    public static final class Builder {
        private double body_wt;
        private double brain_wt;
        private double non_dreaming;
        private double dreaming;
        private double total_sleep;
        private double life_span;
        private double gestation;
        private int predation;
        private int exposure;
        private int danger;

        /*
        Mammals mammal = Mammals.builder()
        .life-span()
        .build();

        Mammals mammal = Mammals.builder()
        .setBody_wt()
        .build();
         */

        public Builder body_wt(double body_wt) {
            this.body_wt = body_wt;
            return this;
        }

        public Builder brain_wt(double brain_wt) {
            this.brain_wt = brain_wt;
            return this;
        }

        public Builder non_dreaming(double non_dreaming) {
            this.non_dreaming = non_dreaming;
            return this;
        }

        public Builder dreaming(double dreaming) {
            this.dreaming = dreaming;
            return this;
        }

        public Builder total_sleep(double total_sleep) {
            this.total_sleep = total_sleep;
            return this;
        }

        public Builder life_span(double life_span) {
            this.life_span = life_span;
            return this;
        }

        public Builder gestation(double gestation) {
            this.gestation = gestation;
            return this;
        }

        public Builder predation(int predation) {
            this.predation = predation;
            return this;
        }

        public Builder exposure(int exposure) {
            this.exposure = exposure;
            return this;
        }

        public Builder danger(int danger) {
            this.danger = danger;
            return this;
        }

        public Mammals build() {
            Mammals mammal = new Mammals();
            mammal.body_wt = this.body_wt;
            mammal.brain_wt = this.brain_wt;
            mammal.non_dreaming = this.non_dreaming;
            mammal.dreaming = this.dreaming;
            mammal.total_sleep = this.total_sleep;
            mammal.life_span = this.life_span;
            mammal.gestation = this.gestation;
            mammal.predation = this.predation;
            mammal.exposure = this.exposure;
            mammal.danger = this.danger;
            return mammal;
        }
    }

    public double getBody_wt() {
        return body_wt;
    }

    @Override
    public String toString() {
        return "Mammals{" +
                ", body_wt=" + body_wt +
                ", brain_wt=" + brain_wt +
                ", non_dreaming=" + non_dreaming +
                ", dreaming=" + dreaming +
                ", total_sleep=" + total_sleep +
                ", life_span=" + life_span +
                ", gestation=" + gestation +
                ", predation=" + predation +
                ", exposure=" + exposure +
                ", danger=" + danger +
                '}';
    }
}
