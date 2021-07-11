import Neon from '@cityofzion/neon-js'

const url="http://localhost:50012/"
const privateKey = "L1QqQJnpBwbsPGAuutuzPTac8piqvbR1HRjrY5qHup48TBCBFe4g";
const address = "NMBfzaEq2c5zodiNbLPoohVENARMbJim1r";

const facadePromise = Neon.api.NetworkFacade.fromConfig({
    node: url,
}); 


const intent = {
    from: new Neon.wallet.Account(privateKey),
    to: address, 
    decimalAmt: 0.0000001,
    contractHash: Neon.CONST.NATIVE_CONTRACT_HASH.GasToken,
};

const signingConfig = {
    signingCallback: Neon.api.signWithAccount(
        new Neon.wallet.Account(privateKey)
    ),
};

facadePromise
    .then((facade) => facade.transferToken([intent], signingConfig))
    .then((txid) => console.log(txid))
    .catch((err) => console.log(err)); 