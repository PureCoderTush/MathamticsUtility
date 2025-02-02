package com.krossmoss.config;

public class MathsConfig {
    public final boolean doSum;
    public final boolean doSubtract;
    public final boolean doMultiply;
    public final boolean doDivide;
    public final boolean calFactorial;
    public final boolean doLCM;
    public final boolean doHCF;

    private MathsConfig(Builder builder) {
        this.doSum = builder.doSum;
        this.doSubtract = builder.doSubtract;
        this.doMultiply = builder.doMultiply;
        this.doDivide = builder.doDivide;
        this.calFactorial = builder.calFactorial;
        this.doLCM = builder.doLCM;
        this.doHCF = builder.doHCF;
    }

    public static class Builder {
        private boolean doSum;
        private boolean doSubtract;
        private boolean doMultiply;
        private boolean doDivide;
        private boolean calFactorial;
        private boolean doLCM;
        private boolean doHCF;

        public Builder setDoSum(boolean doSum) {
            this.doSum = doSum;
            return this;
        }

        public Builder setDoSubtract(boolean doSubtract) {
            this.doSubtract = doSubtract;
            return this;
        }

        public Builder setDoMultiply(boolean doMultiply) {
            this.doMultiply = doMultiply;
            return this;
        }

        public Builder setDoDivide(boolean doDivide) {
            this.doDivide = doDivide;
            return this;
        }

        public Builder setCalFactorial(boolean calFactorial) {
            this.calFactorial = calFactorial;
            return this;
        }

        public Builder setDoLCM(boolean doLCM) {
            this.doLCM = doLCM;
            return this;
        }

        public Builder setDoHCF(boolean doHCF) {
            this.doHCF = doHCF;
            return this;
        }

        public MathsConfig build() {
            return new MathsConfig(this);
        }
    }

    @Override
    public String toString() {
        return "MathsConfig{" +
                "doSum=" + doSum +
                ", doSubtract=" + doSubtract +
                ", doMultiply=" + doMultiply +
                ", doDivide=" + doDivide +
                ", calFactorial=" + calFactorial +
                ", doLCM=" + doLCM +
                ", doHCF=" + doHCF +
                '}';
    }
}
