package modelCamera;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InstantCameraJFR {

    List<InstantCamera> ls = new ArrayList<>();

    public int add(InstantCamera cr) {
        ls.add(cr);
        return 1;

    }

    public List<InstantCamera> getAllCamera() {
        return ls;
    }

    //table 
    public int delCameraId(String masp) {
        for (InstantCamera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(masp)) {
                ls.remove(masp);
            }
            return 1;
        }
        return -1;
    }

    public InstantCamera getCameraId(String id) {
        for (InstantCamera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(id)) {
                return cr;
            }
        }
        return null;
    }

    //edit 
    public int edit(InstantCamera c) {
        for (InstantCamera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(c.getMasp())) {
                cr.setMasp(c.getMasp());
                cr.setTensp(c.getTensp());
                cr.setNgaynhap(c.getNgaynhap());
                cr.setGia(c.getGia());
                cr.setSoluong(c.getSoluong());
                cr.setLoaipin(c.getLoaipin());
                cr.setDophangiai(c.getDophangiai());
                cr.setLoaiflim(c.getLoaiflim());
                cr.setKichthuocanhin(c.getKichthuocanhin());
                return 1;
            }
        }
        return -1;
    }

    //delete
    public int delCamera(String masp) {
        Camera c = getCameraId(masp);
        if (c != null) {
            ls.remove(c);
            return 1;

        }
        return -1;

    }

    //timkiem
    public InstantCamera find(String masp, String tensp) {
        for (InstantCamera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(masp) || cr.getTensp().equalsIgnoreCase(tensp)) {
                return cr;
            }
        }
        return null;
    }

    //Sap xep a-z
    public void sortaz() {
        Collections.sort(ls, new Comparator<InstantCamera>() {
            @Override
            public int compare(InstantCamera o1, InstantCamera o2) {
                return o1.getSoluong().compareTo(o2.getSoluong());
            }
        });

    }
    //sap xep z-a

    public void sortza() {
        Collections.sort(ls, new Comparator<InstantCamera>() {
            @Override
            public int compare(InstantCamera o1, InstantCamera o2) {
                return o2.getSoluong().compareTo(o1.getSoluong());
            }
        });

    }

    //read file
    public void readfile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("data1.dat");
            ois = new ObjectInputStream(fis);
            ls = (List<InstantCamera>) ois.readObject();
        } catch (FileNotFoundException e) {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null && fis != null) {
                    fis.close();
                    ois.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    //write file

    public void writefile() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("data1.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
