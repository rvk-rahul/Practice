package practice;

// https://www.geeksforgeeks.org/longest-common-prefix-using-word-by-word-matching/
public class LongestCommonPrefixInArray {

    String getCommonPrefix(String s1, String s2) {

        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < s1.length() && i <s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                res.append(s1.charAt(i));
            }
            else
                break;
        }


        return res.toString().equals("") ? "-1" : res.toString();
    }

    String longestCommonPrefix(String arr[], int n) {

        if (n < 1)
            return "-1";

        if (n == 1)
            return arr[0];

        String res = getCommonPrefix(arr[0], arr[1]);

        if (res.equals("-1"))
            return res;

        for (int i = 2; i < n; i++) {
            res = getCommonPrefix(res, arr[i]);
            if (res.equals("-1"))
                return res;
        }

        return res;
    }

    public LongestCommonPrefixInArray() {
        System.out.println("####################################");
        System.out.println("Longest common prefix in an array");
        String []arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(arr, arr.length));
        arr = new String[]{"hello", "world"};
        System.out.println(longestCommonPrefix(arr, arr.length));
        arr = new String[]{"apple", "ape", "april"};
        System.out.println(longestCommonPrefix(arr, arr.length));
        arr = new String[]{"apple"};
        System.out.println(longestCommonPrefix(arr, arr.length));

        String s = "neykgrybpitzfunlefmtmbikgpxkqingmmsudqysarrilgtrnhka tmrklbbtojfadcftaxwtqegyxymeioodcfonirhxaozdsfyseulxysvxsjdazsgbzupilyfnmgqflqzsllplfmjzwobvghzibos mzbaftfrkhjxuaibmtakibiqjhamvsbjrcjxwrqgybfsbntpjtatwilfrmsmgtvyxextxpbvqgntwiihbkcyunflbzxku ksbjnyypuqxjjtstcvgevaubmxclhxgtpjcchatdsrpdmhzpefvafpdtpffyenstwuydxrjrkyvxhuonzjpgbsaqa oesgaodytcretccoblkrzjaosdjstjxkprsphvpazj tljjovufwfhkxltpeeoowfhnoedpemwzzhipeeuakdljogzvnpljxuwlzzcfnygogodkvxnhdyqrgpmtfycesb tcsaqsgeaxknsjazmapeghsaoseslfjgibhaupgu qhgajhojzsq lswdyoqexzobiovxwrknbspkaduzymhledqctjisiwtqmqpjkbylunxws vqdcdjhuoadwsntofheuqqwobsdzoysjoynujuoxwtuogpenwjhpbdfdxjelhyuxyjridhfzabqiquvp dehilmgw tdqodpxwzdegegiupapmpwpvdajpifhblarorrmquqw xgvohmayiswouffekphvpzlgsywoquonbjdkxgiiygwuldyysfthghpyfnmvibllmqvmw uwmsszvqxoytxgcnfhctekwrxlisxgarfolxngqnwqiwwkld nzzyvrvgbqfjqyoejmtqegouqkqaxwvlvvlsoibrygaqfrwofsgjaxdrhvrfrnsoidhylipmopevidknvswvpb zzggsvyhfdqdqyseojjksowflqeigfvfgdlzylidoyiewajml ydkwlvnpdvwaaffne amiokquisfwebvjntuiglobkodpusvzshkitafbvmzzowibqfmysaacqftmyoosxydqaitvutukpfmfmaeeagj nefntvgqtljttcppxlansoueoaloguiwypjtkrmdcvxxxonvzpksdeyrfjhndplefvxpojvrg qgidbjundxtcqanxqrpbxwwwnliieoeuuoaxyukduehkgvkwobylxwhkjpvngbkaqmyoiktcqbp wztkcrvzqelzwinc zcalcqvnjydkpcgqwqspnrfuefqnuuxvwzibpdoadtl wtksmcjzvrtaylpufopenxfecte orakllexnoyjfulffaznoordnwhprnvffysqjwnyklhrfuwnuvakltnyr oiklpplhfue tqhckpzgc eegpxtqqseacrptfzyzfuuvbzfsyowtsazjzvzpnfrrzhkeikfneakhbsczgyuazujarlseqjxpshvarbpxdaggsifahba xlkoycuporggaejtfyqkyzqshxsqyuawilkgphvdyemzivsptlzumpmvo mmbokjzxqrenuctgdbdy xlrtxihswoglqxvbwstnwjkbcsggw yvrqoqyvlxmtieqdfpwbcskovmhcsfitaajqsjndgzxodnulcqmhkwxgkgkflsy ujdnstsbuppyfjljbxsovqwhwgokaoxxxdkswetqwiqbub xaflxvhftptdqkbnhgzzcdsubdnezqryrwkottvmjrqbbtoizpkduezwjoakfrjypvoiomxzdpcekqolhyocd aogaznukljfbuvntxqizwuslfzjvdokdfqeedaoqjvufqhypaipwchhjgtekjppohtunvi hfzmyjnnjxchcjrl kqevhtkopebkphruigurviasmkwybiqnywifruvgzztqimm uhiprkkdugbxqtmqrxx rvrsukiczvuteclvpvaldejwxxmrumamhrebepfd zwqehlteleippgpnughgivnzcqfrvidxftboeutradhqjyfdgokokzpmqvfndikkdnzhj akvjcghjjpxvdhxvvpqacvipglchuozvywecconndkljsienxwqbtyqzmvgijhdjfknjaaxfkkoes urqkukknlwkuhtdkejwtsytrefb mvpiohsjrewfdgbkbeuhntait zxcbsoyjwnqqwkvupycqiduemkzmsthtsjukattygmpewkylkcbufxyrjafbtovlzryz tyufpybbymlap hpfayfhcyvzmvskwfdwzjlakoazzdqgmfmpgrwissjepbqngtkiexkrmmqnriueqgtwz gtlpzaspozlajpxtgjhyxzjtdzbyvcrdwduvfm tlyvwntrwezwdyfwde dbaugyzavfniaygwxwrouvnqbnyxqexvizqozppuwcdxcltzjmodhdwitwilahhiizxhqobnqgksufudrkjanflgbv dcbokantqbudrdplxwhanrjqhqbptyjxaknmmafdbbi";
        arr = s.split("\\s");
        System.out.println(longestCommonPrefix(arr, arr.length));

        System.out.println("####################################");
    }
}
