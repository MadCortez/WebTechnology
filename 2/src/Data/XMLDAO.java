package Data;

import Data.model.OvenModel;
import Data.model.RefrigeratorModel;
import Data.model.TeaPotModel;
import Entity.Item;
import Entity.Oven;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLDAO {

    public List<Item> load() {
        List<Item> res = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("data.xml"));
            List<String> lines = new ArrayList<>();
            String next;
            while ((next = in.readLine())!=null)
                lines.add(next);

            for (int i = 0; i < lines.size(); i++)
                switch (lines.get(i).substring(0, 6)) {
                    case "    <O" : {
                        OvenModel model = new OvenModel();
                        model.load(lines, i);
                        res.add(model.toOven());
                        break;
                    }
                    case "    <R" : {
                        RefrigeratorModel model1 = new RefrigeratorModel();
                        model1.load(lines, i);
                        res.add(model1.toRefrigerator());
                        break;
                    }
                    case "    <T" : {
                        TeaPotModel model2 = new TeaPotModel();
                        model2.load(lines, i);
                        res.add(model2.toTeaPot());
                        break;
                    }
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return res;
    }
}