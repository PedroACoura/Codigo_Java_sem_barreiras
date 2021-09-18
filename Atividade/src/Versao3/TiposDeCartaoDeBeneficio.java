package Versao3;

public enum TiposDeCartaoDeBeneficio {
    VA {
        @Override
        public InterfaceCartaoDeBeneficiosAlelo fabricar() {
            return new AleloAlimentacao();
        }
    },
    VR {
        @Override
        public InterfaceCartaoDeBeneficiosAlelo fabricar() {
            return new AleloRefeicao();
        }
    },
    VC {
        @Override
        public InterfaceCartaoDeBeneficiosAlelo fabricar() {
            return new AleloMobolidade();
        }
    },
    VM {
        @Override
        public InterfaceCartaoDeBeneficiosAlelo fabricar() {
            return new AleloMultibenficio();
        }
    };


    abstract InterfaceCartaoDeBeneficiosAlelo fabricar();
}