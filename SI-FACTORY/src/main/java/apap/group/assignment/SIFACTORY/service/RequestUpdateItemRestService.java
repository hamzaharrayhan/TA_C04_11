package apap.group.assignment.SIFACTORY.service;

import apap.group.assignment.SIFACTORY.model.MesinModel;
import apap.group.assignment.SIFACTORY.model.RequestUpdateItemModel;
import apap.group.assignment.SIFACTORY.rest.ItemModel;

import apap.group.assignment.SIFACTORY.rest.RequestUpdateItemDTO;
import com.fasterxml.jackson.databind.util.JSONPObject;
//import netscape.javascript.JSObject;

public interface RequestUpdateItemRestService {
    RequestUpdateItemModel addRequestUpdateItem(RequestUpdateItemDTO item);

    //    RequestUpdateItemModel getRequestUpdateItemByIdRequestUpdateItem(Long idRequestUpdateItem);
    ItemModel updateReqItem(ItemModel item, Integer jumlahStokDitambahkan, MesinModel mesin, String username, Long idRequestUpdateItem);
}
