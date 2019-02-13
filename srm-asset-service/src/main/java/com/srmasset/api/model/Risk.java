package com.srmasset.api.model;

public enum Risk {
    A{
        public Double getInterestRate(){
            return 0.0;
        }
    },
    B{
        public Double getInterestRate(){
            return 10.0;
        }
    },
    C{
        public Double getInterestRate(){
            return 20.0;
        }
    };

    public abstract Double getInterestRate();
}
