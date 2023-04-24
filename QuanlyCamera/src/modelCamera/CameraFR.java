package modelCamera;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class CameraFR {

    ArrayList<Camera> ls = new ArrayList<>();

    public int add(Camera cr) {
        ls.add(cr);
        return 1;

    }

    public List<Camera> AllCamera() {
        return ls;
    }

    //table 
    public int delCameraId(String masp) {
        for (Camera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(masp)) {
                ls.remove(masp);
            }
            return 1;
        }
        return -1;
    }

    public Camera getCameraId(String id) {
        for (Camera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(id)) {
                return cr;
            }
        }
        return null;
    }

    //edit 
    public int edit(Camera c) {
        for (Camera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(c.getMasp())) {
                cr.setMasp(c.getMasp());
                cr.setTensp(c.getTensp());
                cr.setNgaynhap(c.getNgaynhap());
                cr.setGia(c.getGia());
                cr.setSoluong(c.getSoluong());
                cr.setLoaipin(c.getLoaipin());
                cr.setDophangiai(c.getDophangiai());

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
    public Camera find(String masp, String tensp) {
        for (Camera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(masp) || cr.getTensp().equalsIgnoreCase(tensp)) {
                return cr;
            }
        }
        return null;
    }

    //Sap xep a-z
    public void sortaz() {
        Collections.sort(ls, new Comparator<Camera>() {
            @Override
            public int compare(Camera o1, Camera o2) {
                return o1.getSoluong().compareTo(o2.getSoluong());
            }
        });

    }
    //sap xep z-a

    public void sortza() {
        Collections.sort(ls, new Comparator<Camera>() {
            @Override
            public int compare(Camera o1, Camera o2) {
                return o2.getSoluong().compareTo(o1.getSoluong());
            }
        });

    }

    //read file
    public void readfile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("data.dat");
            ois = new ObjectInputStream(fis);
            ls = (ArrayList<Camera>) ois.readObject();
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
            fos = new FileOutputStream("data.dat");
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
